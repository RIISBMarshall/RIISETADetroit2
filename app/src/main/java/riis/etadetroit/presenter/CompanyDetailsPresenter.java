package riis.etadetroit.presenter;

import android.content.Context;
import android.database.Cursor;

import riis.etadetroit.interfaces.CompanyDetailsContract;
import riis.etadetroit.model.CompanyData;
import riis.etadetroit.model.ETADetroitDatabaseHelper;

/**
 * Created by bmarshall on 2/6/17.
 */

public class CompanyDetailsPresenter implements CompanyDetailsContract.CompanyDetailsPresenter {

    private ETADetroitDatabaseHelper eTADetroitDatabaseHelper;

    public CompanyDetailsPresenter(Context context){
        eTADetroitDatabaseHelper = new ETADetroitDatabaseHelper(context);
    }

    public String getCompanyName(int position) {
        CompanyData companyData = new CompanyData(eTADetroitDatabaseHelper.getCompanyNames());
        return companyData.getCompanyName(position);
    }

    public int getCompanyImageResourceId(Context context, int position) {
        CompanyData companyData = new CompanyData(eTADetroitDatabaseHelper.getCompanyNames());
        return companyData.getCompanyImageResourceId(context, position);
    }

    public Cursor getRoutes(String company) {
        return eTADetroitDatabaseHelper.getRoutes(company);
    }
}
