package GetLocation;
import java.io.File;
import java.io.IOException;
import com.maxmind.geoip.Location;
import com.maxmind.geoip.LookupService;
import com.maxmind.geoip.regionName;


public class GetLocationExample {

  public static void main(String[] args) {
    GetLocationExample obj = new GetLocationExample();
    ServerLocation location = obj.getLocation("18.222.200.3");
    System.out.println(location);
  }

  public ServerLocation getLocation(String ipAddress) {

    File file = new File(
        "C:\\Users\\achoc\\Documents\\GeoLiteCity.dat");
    return getLocation(ipAddress, file);

  }

  public ServerLocation getLocation(String ipAddress, File file) {

    ServerLocation serverLocation = null;

    try {

    serverLocation = new ServerLocation();

    LookupService lookup = new LookupService(file,LookupService.GEOIP_MEMORY_CACHE);
    Location locationServices = lookup.getLocation(ipAddress);

    serverLocation.setCountryCode(locationServices.countryCode);
    serverLocation.setCountryName(locationServices.countryName);
    serverLocation.setRegion(locationServices.region);
    serverLocation.setRegionName(regionName.regionNameByCode(
             locationServices.countryCode, locationServices.region));
    serverLocation.setCity(locationServices.city);
    serverLocation.setPostalCode(locationServices.postalCode);
    serverLocation.setLatitude(String.valueOf(locationServices.latitude));
    serverLocation.setLongitude(String.valueOf(locationServices.longitude));

    } catch (IOException e) {
        System.err.println(e.getMessage());
    }

    return serverLocation;

  }
 
		
}
