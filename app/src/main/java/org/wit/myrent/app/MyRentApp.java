package org.wit.myrent.app;

import static org.wit.android.helpers.LogHelpers.info;
import org.wit.myrent.models.Portfolio;
import org.wit.myrent.models.PortfolioSerializer;

import android.app.Application;

public class MyRentApp extends Application
{
    public Portfolio portfolio;
    private static final String FILENAME = "portfolio.json";

    @Override
    public void onCreate() {
        super.onCreate();
        PortfolioSerializer serializer = new PortfolioSerializer(this, FILENAME);
        portfolio = new Portfolio(serializer);
        info(this, "MyRent app launched");
    }
}