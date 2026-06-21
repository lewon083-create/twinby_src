package ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.hw0;
import com.google.android.gms.internal.measurement.t8;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends hw0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30285b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1.d0 f30286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Context context) {
        super(context, "google_app_measurement.db");
        this.f30286c = nVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f30285b) {
            case 0:
                n nVar = (n) this.f30286c;
                l1 l1Var = (l1) nVar.f15951b;
                l1 l1Var2 = (l1) nVar.f15951b;
                l1Var.getClass();
                com.google.android.gms.ads.identifier.c cVar = nVar.f30307f;
                if (cVar.f2534c != 0) {
                    ((ua.a) cVar.f2535d).getClass();
                    if (SystemClock.elapsedRealtime() - cVar.f2534c < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((ua.a) cVar.f2535d).getClass();
                    cVar.f2534c = SystemClock.elapsedRealtime();
                    s0 s0Var = l1Var2.f30265g;
                    l1.k(s0Var);
                    s0Var.f30411g.f("Opening the database failed, dropping and recreating it");
                    if (!l1Var2.f30260b.getDatabasePath("google_app_measurement.db").delete()) {
                        s0 s0Var2 = l1Var2.f30265g;
                        l1.k(s0Var2);
                        s0Var2.f30411g.g("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        cVar.f2534c = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e3) {
                        s0 s0Var3 = l1Var2.f30265g;
                        l1.k(s0Var3);
                        s0Var3.f30411g.g(e3, "Failed to open freshly created database");
                        throw e3;
                    }
                }
            default:
                n0 n0Var = (n0) this.f30286c;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e7) {
                    throw e7;
                } catch (SQLiteException unused2) {
                    l1 l1Var3 = (l1) n0Var.f15951b;
                    s0 s0Var4 = l1Var3.f30265g;
                    l1.k(s0Var4);
                    s0Var4.f30411g.f("Opening the local database failed, dropping and recreating it");
                    if (!l1Var3.f30260b.getDatabasePath("google_app_measurement_local.db").delete()) {
                        s0 s0Var5 = l1Var3.f30265g;
                        l1.k(s0Var5);
                        s0Var5.f30411g.g("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e10) {
                        s0 s0Var6 = ((l1) n0Var.f15951b).f30265g;
                        l1.k(s0Var6);
                        s0Var6.f30411g.g(e10, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f30285b) {
            case 0:
                s0 s0Var = ((l1) ((n) this.f30286c).f15951b).f30265g;
                l1.k(s0Var);
                y1.f(s0Var, sQLiteDatabase);
                break;
            default:
                s0 s0Var2 = ((l1) ((n0) this.f30286c).f15951b).f30265g;
                l1.k(s0Var2);
                y1.f(s0Var2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        int i11 = this.f30285b;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        switch (this.f30285b) {
            case 0:
                l1 l1Var = (l1) ((n) this.f30286c).f15951b;
                s0 s0Var = l1Var.f30265g;
                l1.k(s0Var);
                y1.d(s0Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", n.f30296g);
                s0 s0Var2 = l1Var.f30265g;
                l1.k(s0Var2);
                y1.d(s0Var2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                l1.k(s0Var2);
                y1.d(s0Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                l1.k(s0Var2);
                y1.d(s0Var2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", n.i);
                l1.k(s0Var2);
                y1.d(s0Var2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", n.f30298j);
                l1.k(s0Var2);
                y1.d(s0Var2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", n.f30300l);
                l1.k(s0Var2);
                y1.d(s0Var2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                l1.k(s0Var2);
                y1.d(s0Var2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", n.f30299k);
                l1.k(s0Var2);
                y1.d(s0Var2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", n.f30301m);
                l1.k(s0Var2);
                y1.d(s0Var2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", n.f30302n);
                l1.k(s0Var2);
                y1.d(s0Var2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                l1.k(s0Var2);
                y1.d(s0Var2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", n.f30303o);
                l1.k(s0Var2);
                y1.d(s0Var2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                l1.k(s0Var2);
                y1.d(s0Var2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                l1.k(s0Var2);
                y1.d(s0Var2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", n.f30304p);
                t8.a();
                l1.k(s0Var2);
                y1.d(s0Var2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", n.f30305q);
                l1.k(s0Var2);
                y1.d(s0Var2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", n.f30297h);
                l1.k(s0Var2);
                y1.d(s0Var2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                s0 s0Var3 = ((l1) ((n0) this.f30286c).f15951b).f30265g;
                l1.k(s0Var3);
                y1.d(s0Var3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", n0.f30308f);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        int i11 = this.f30285b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n0 n0Var, Context context) {
        super(context, "google_app_measurement_local.db");
        this.f30286c = n0Var;
    }

    private final void a(SQLiteDatabase sQLiteDatabase, int i, int i10) {
    }

    private final void b(SQLiteDatabase sQLiteDatabase, int i, int i10) {
    }

    private final void d(SQLiteDatabase sQLiteDatabase, int i, int i10) {
    }

    private final void h(SQLiteDatabase sQLiteDatabase, int i, int i10) {
    }
}
