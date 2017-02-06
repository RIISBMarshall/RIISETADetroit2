package riis.etadetroit.interfaces;

import android.content.Context;
import android.database.Cursor;

import riis.etadetroit.model.CompanyData;

/**
 * Created by bmarshall on 2/6/17.
 */

public class CompanyDetailsContract {

    public interface CompanyDetailsPresenter {

        String getCompanyName(int position);

        int getCompanyImageResourceId(Context context, int position);

        Cursor getRoutes(String company);
    }

    public interface CompanyDetailsView{
        void initializeAttributes();
        void initializeViews();
        void setUpAdapter();
        void loadBusCompany();
        void windowTransition();
        void getPhoto();

    }
}