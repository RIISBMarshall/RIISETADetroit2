package riis.etadetroit.presenter;

import android.content.Context;

import riis.etadetroit.interfaces.MainContract;
import riis.etadetroit.model.CompanyData;
import riis.etadetroit.model.ETADetroitDatabaseHelper;

/**
 * Created by bmarshall on 2/6/17.
 */

public class MainActivityPresenter implements MainContract.MainPresenter {

    private ETADetroitDatabaseHelper eTADetroitDatabaseHelper;

    public MainActivityPresenter(Context context){
        eTADetroitDatabaseHelper = new ETADetroitDatabaseHelper(context);
    }

    public int getCompanyListSize() {
        return eTADetroitDatabaseHelper.getCompanyNames().getCount();
    }

    public String getCompanyName(int position) {
        CompanyData companyData = new CompanyData(eTADetroitDatabaseHelper.getCompanyNames());
        return companyData.getCompanyName(position);
    }

    public int getCompanyImageResourceId(Context context, int position) {
        CompanyData companyData = new CompanyData(eTADetroitDatabaseHelper.getCompanyNames());
        return companyData.getCompanyImageResourceId(context, position);
    }
}
