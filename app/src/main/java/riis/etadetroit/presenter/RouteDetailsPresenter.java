package riis.etadetroit.presenter;

import android.content.Context;
import android.database.Cursor;

import riis.etadetroit.interfaces.RouteDetailsContract;
import riis.etadetroit.model.ETADetroitDatabaseHelper;

/**
 * Created by bmarshall on 2/6/17.
 */

public class RouteDetailsPresenter implements RouteDetailsContract.RouteDetailsPresenter {
    private ETADetroitDatabaseHelper eTADetroitDatabaseHelper;

    public RouteDetailsPresenter(Context context){
        eTADetroitDatabaseHelper = new ETADetroitDatabaseHelper(context);
    }

    public Cursor getRouteDetails(String route) {
        return eTADetroitDatabaseHelper.getRouteDetails(route);
    }

    public Cursor getRouteStops(String route_id) {
        return eTADetroitDatabaseHelper.getRouteStops(route_id);
    }
}
