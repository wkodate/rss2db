package com.wkodate.jupiter.rss2db;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 設定ファイルを扱うクラス.
 */
public class Configuration {

    private static final String DBTYPE_KEY = "dbtype";
    private static final String DBHOST_KEY = "dbhost";
    private static final String DBNAME_KEY = "dbname";
    private static final String DBUSER_KEY = "dbuser";
    private static final String DBPASSWORD_KEY = "dbpassword";
    private static final String FETCH_INTERVAL_MS_KEY = "fetch_interval_ms";
    private static final String PERMIT_TWEET_KEY = "permit_tweet";
    private static final String TWITTER_CONSUMER_KEY_KEY = "twitter_consumer_key";
    private static final String TWITTER_CONSUMER_SECRET_KEY = "twitter_consumer_secret";
    private static final String TWITTER_ACCESS_TOKEN_KEY = "twitter_access_token";
    private static final String TWITTER_ACCESS_TOKEN_SECRET_KEY = "twitter_access_token_secret";
    private static final String MAX_TWEETS_KEY = "max_tweets";

    private Properties prop = new Properties();

    public Configuration(final String filename) {
        try (FileInputStream fi = new FileInputStream(filename)) {
            prop.load(fi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final String getDbType() {
        return prop.getProperty(DBTYPE_KEY);
    }

    public final String getDbHost() {
        return prop.getProperty(DBHOST_KEY);
    }

    public final String getDbName() {
        return prop.getProperty(DBNAME_KEY);
    }

    public final String getDbUser() {
        return prop.getProperty(DBUSER_KEY);
    }

    public final String getDbPassword() {
        return prop.getProperty(DBPASSWORD_KEY);
    }

    public final long getFetchIntervalMs() {
        return Long.parseLong(prop.getProperty(FETCH_INTERVAL_MS_KEY));
    }

    public final boolean getPermiteTweet() {
        return Boolean.parseBoolean(prop.getProperty(PERMIT_TWEET_KEY));
    }

    public final String getTwitterConsumerKey() {
        return prop.getProperty(TWITTER_CONSUMER_KEY_KEY);
    }

    public final String getTwitterConsumerSecret() {
        return prop.getProperty(TWITTER_CONSUMER_SECRET_KEY);
    }

    public final String getTwitterAccessToken() {
        return prop.getProperty(TWITTER_ACCESS_TOKEN_KEY);
    }

    public final String getTwitterAccessTokenSecret() {
        return prop.getProperty(TWITTER_ACCESS_TOKEN_SECRET_KEY);
    }

    public final int getMaxTweets() {
        return Integer.parseInt(prop.getProperty(MAX_TWEETS_KEY));
    }

}
