


import java.net.MalformedURLException;

import org.ektorp.CouchDbConnector;

import org.ektorp.CouchDbInstance;

import org.ektorp.http.HttpClient;

import org.ektorp.http.StdHttpClient;

import org.ektorp.impl.StdCouchDbConnector;

import org.ektorp.impl.StdCouchDbInstance;

import org.ektorp.support.DesignDocument;


public class main {
    public static void main(String[] args) throws MalformedURLException{

        HttpClient httpClient = new StdHttpClient.Builder().url("http://localhost:5984").build();
        CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
        CouchDbConnector db = new StdCouchDbConnector("etudiant", dbInstance);
        db.createDatabaseIfNotExists();
        DesignDocument dd = new DesignDocument("test");
        db.create(dd);



    }


}
