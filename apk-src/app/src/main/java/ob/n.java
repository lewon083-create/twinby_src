package ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.t8;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.metrics.MetricsUnit;
import io.sentry.protocol.App;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends u3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f30296g = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f30297h = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] i = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f30298j = {App.JsonKeys.APP_VERSION, "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", MetricsUnit.Duration.DAY, "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f30299k = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f30300l = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f30301m = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f30302n = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f30303o = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String[] f30304p = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String[] f30305q = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f30306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.ads.identifier.c f30307f;

    public n(z3 z3Var) {
        super(z3Var);
        this.f30307f = new com.google.android.gms.ads.identifier.c(((l1) this.f15951b).f30269l);
        ((l1) this.f15951b).getClass();
        this.f30306e = new m(this, ((l1) this.f15951b).f30260b);
    }

    public static final String f0(List list) {
        return list.isEmpty() ? "" : pe.a.f(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void l0(ContentValues contentValues, Object obj) {
        pa.c0.f("value");
        pa.c0.i(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f6: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:247), block:B:29:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ob.e A0(java.lang.String r27, java.lang.String r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.n.A0(java.lang.String, java.lang.String):ob.e");
    }

    public final void B0(String str, String str2) {
        pa.c0.f(str);
        pa.c0.f(str2);
        C();
        D();
        try {
            r0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e3) {
            l1 l1Var = (l1) this.f15951b;
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30411g.i("Error deleting conditional property", s0.K(str), l1Var.f30268k.c(str2), e3);
        }
    }

    public final List C0(String str, String str2, String str3) {
        pa.c0.f(str);
        C();
        D();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return D0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        r3 = r2.f30265g;
        ob.l1.k(r3);
        r3.f30411g.g(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List D0(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.n.D0(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x03ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ob.w0 E0(java.lang.String r53) {
        /*
            Method dump skipped, instruction units count: 1009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.n.E0(java.lang.String):ob.w0");
    }

    public final void F0(w0 w0Var, boolean z5) {
        l1 l1Var = (l1) this.f15951b;
        l1 l1Var2 = w0Var.f30468a;
        C();
        D();
        String strD = w0Var.D();
        pa.c0.i(strD);
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, strD);
        w1 w1Var = w1.ANALYTICS_STORAGE;
        z3 z3Var = this.f30373c;
        if (z5) {
            contentValues.put("app_instance_id", (String) null);
        } else if (z3Var.a(strD).i(w1Var)) {
            contentValues.put("app_instance_id", w0Var.E());
        }
        contentValues.put("gmp_app_id", w0Var.G());
        if (z3Var.a(strD).i(w1.AD_STORAGE)) {
            i1 i1Var = l1Var2.f30266h;
            l1.k(i1Var);
            i1Var.C();
            contentValues.put("resettable_device_id_hash", w0Var.f30472e);
        }
        i1 i1Var2 = l1Var2.f30266h;
        l1.k(i1Var2);
        i1Var2.C();
        contentValues.put("last_bundle_index", Long.valueOf(w0Var.f30474g));
        i1 i1Var3 = l1Var2.f30266h;
        l1.k(i1Var3);
        i1Var3.C();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(w0Var.f30475h));
        i1 i1Var4 = l1Var2.f30266h;
        l1.k(i1Var4);
        i1Var4.C();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(w0Var.i));
        contentValues.put(App.JsonKeys.APP_VERSION, w0Var.N());
        i1 i1Var5 = l1Var2.f30266h;
        l1.k(i1Var5);
        i1Var5.C();
        contentValues.put("app_store", w0Var.f30478l);
        i1 i1Var6 = l1Var2.f30266h;
        l1.k(i1Var6);
        i1Var6.C();
        contentValues.put("gmp_version", Long.valueOf(w0Var.f30479m));
        i1 i1Var7 = l1Var2.f30266h;
        l1.k(i1Var7);
        i1Var7.C();
        contentValues.put("dev_cert_hash", Long.valueOf(w0Var.f30480n));
        i1 i1Var8 = l1Var2.f30266h;
        l1.k(i1Var8);
        i1Var8.C();
        contentValues.put("measurement_enabled", Boolean.valueOf(w0Var.f30481o));
        i1 i1Var9 = l1Var2.f30266h;
        i1 i1Var10 = l1Var2.f30266h;
        l1.k(i1Var9);
        i1Var9.C();
        contentValues.put(MetricsUnit.Duration.DAY, Long.valueOf(w0Var.J));
        l1.k(i1Var10);
        i1Var10.C();
        contentValues.put("daily_public_events_count", Long.valueOf(w0Var.K));
        l1.k(i1Var10);
        i1Var10.C();
        contentValues.put("daily_events_count", Long.valueOf(w0Var.L));
        l1.k(i1Var10);
        i1Var10.C();
        contentValues.put("daily_conversions_count", Long.valueOf(w0Var.M));
        i1 i1Var11 = l1Var2.f30266h;
        l1.k(i1Var11);
        i1Var11.C();
        contentValues.put("config_fetched_time", Long.valueOf(w0Var.R));
        i1 i1Var12 = l1Var2.f30266h;
        l1.k(i1Var12);
        i1Var12.C();
        contentValues.put("failed_config_fetch_time", Long.valueOf(w0Var.S));
        contentValues.put("app_version_int", Long.valueOf(w0Var.P()));
        contentValues.put("firebase_instance_id", w0Var.J());
        l1.k(i1Var10);
        i1Var10.C();
        contentValues.put("daily_error_events_count", Long.valueOf(w0Var.N));
        l1.k(i1Var10);
        i1Var10.C();
        contentValues.put("daily_realtime_events_count", Long.valueOf(w0Var.O));
        l1.k(i1Var10);
        i1Var10.C();
        contentValues.put("health_monitor_sample", w0Var.P);
        contentValues.put("android_id", (Long) 0L);
        i1 i1Var13 = l1Var2.f30266h;
        l1.k(i1Var13);
        i1Var13.C();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(w0Var.f30482p));
        contentValues.put("dynamite_version", Long.valueOf(w0Var.b()));
        if (z3Var.a(strD).i(w1Var)) {
            i1 i1Var14 = l1Var2.f30266h;
            l1.k(i1Var14);
            i1Var14.C();
            contentValues.put("session_stitching_token", w0Var.f30486t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(w0Var.y()));
        i1 i1Var15 = l1Var2.f30266h;
        l1.k(i1Var15);
        i1Var15.C();
        contentValues.put("target_os_version", Long.valueOf(w0Var.f30488v));
        i1 i1Var16 = l1Var2.f30266h;
        l1.k(i1Var16);
        i1Var16.C();
        contentValues.put("session_stitching_token_hash", Long.valueOf(w0Var.f30489w));
        t8.a();
        g gVar = l1Var.f30263e;
        s0 s0Var = l1Var.f30265g;
        if (gVar.M(strD, d0.P0)) {
            i1 i1Var17 = l1Var2.f30266h;
            l1.k(i1Var17);
            i1Var17.C();
            contentValues.put("ad_services_version", Integer.valueOf(w0Var.f30490x));
            i1 i1Var18 = l1Var2.f30266h;
            l1.k(i1Var18);
            i1Var18.C();
            contentValues.put("attribution_eligibility_status", Long.valueOf(w0Var.B));
        }
        i1 i1Var19 = l1Var2.f30266h;
        l1.k(i1Var19);
        i1Var19.C();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(w0Var.f30491y));
        contentValues.put("npa_metadata_value", w0Var.w());
        i1 i1Var20 = l1Var2.f30266h;
        l1.k(i1Var20);
        i1Var20.C();
        contentValues.put("bundle_delivery_index", Long.valueOf(w0Var.F));
        contentValues.put("sgtm_preview_key", w0Var.C());
        l1.k(i1Var10);
        i1Var10.C();
        contentValues.put("dma_consent_state", Integer.valueOf(w0Var.D));
        l1.k(i1Var10);
        i1Var10.C();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(w0Var.E));
        contentValues.put("serialized_npa_metadata", w0Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(w0Var.t()));
        i1 i1Var21 = l1Var2.f30266h;
        l1.k(i1Var21);
        i1Var21.C();
        ArrayList arrayList = w0Var.f30485s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                l1.k(s0Var);
                s0Var.f30413j.g(strD, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(StringUtils.COMMA, arrayList));
            }
        }
        if (l1Var.f30263e.M(null, d0.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        i1 i1Var22 = l1Var2.f30266h;
        l1.k(i1Var22);
        i1Var22.C();
        contentValues.put("unmatched_pfo", w0Var.f30492z);
        i1 i1Var23 = l1Var2.f30266h;
        l1.k(i1Var23);
        i1Var23.C();
        contentValues.put("unmatched_uwa", w0Var.A);
        i1 i1Var24 = l1Var2.f30266h;
        l1.k(i1Var24);
        i1Var24.C();
        contentValues.put("ad_campaign_info", w0Var.H);
        try {
            SQLiteDatabase sQLiteDatabaseR0 = r0();
            if (sQLiteDatabaseR0.update("apps", contentValues, "app_id = ?", new String[]{strD}) == 0 && sQLiteDatabaseR0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                l1.k(s0Var);
                s0Var.f30411g.g(s0.K(strD), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e3) {
            l1.k(s0Var);
            s0Var.f30411g.h(s0.K(strD), "Error storing app. appId", e3);
        }
    }

    public final long G(String str, com.google.android.gms.internal.measurement.j3 j3Var, String str2, Map map, q2 q2Var, Long l10) {
        int iDelete;
        l1 l1Var = (l1) this.f15951b;
        C();
        D();
        pa.c0.i(j3Var);
        pa.c0.f(str);
        C();
        D();
        if (j0()) {
            z3 z3Var = this.f30373c;
            long jF = z3Var.f30612j.f30114g.f();
            ua.a aVar = l1Var.f30269l;
            s0 s0Var = l1Var.f30265g;
            aVar.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jF) > ((Long) d0.M.a(null)).longValue()) {
                z3Var.f30612j.f30114g.g(jElapsedRealtime);
                C();
                D();
                if (j0() && (iDelete = r0().delete("upload_queue", e0(), new String[0])) > 0) {
                    l1.k(s0Var);
                    s0Var.f30418o.g(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                pa.c0.f(str);
                C();
                D();
                try {
                    int iK = l1Var.f30263e.K(str, d0.A);
                    if (iK > 0) {
                        r0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iK)});
                    }
                } catch (SQLiteException e3) {
                    l1.k(s0Var);
                    s0Var.f30411g.h(s0.K(str), "Error deleting over the limit queued batches. appId", e3);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append("=");
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] bArrA = j3Var.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("measurement_batch", bArrA);
        contentValues.put("upload_uri", str2);
        StringBuilder sb3 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb3.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb3.append((CharSequence) "\r\n");
            }
        }
        contentValues.put("upload_headers", sb3.toString());
        contentValues.put("upload_type", Integer.valueOf(q2Var.f30372b));
        ua.a aVar2 = l1Var.f30269l;
        s0 s0Var2 = l1Var.f30265g;
        aVar2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long jInsert = r0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            l1.k(s0Var2);
            s0Var2.f30411g.g(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e7) {
            l1.k(s0Var2);
            s0Var2.f30411g.h(str, "Error storing MeasurementBatch to upload_queue. appId", e7);
            return -1L;
        }
    }

    public final j G0(long j10, String str, boolean z5, boolean z10, boolean z11, boolean z12) {
        return H0(j10, str, 1L, false, false, z5, false, z10, z11, z12);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List H(java.lang.String r19, ob.s3 r20, int r21) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.n.H(java.lang.String, ob.s3, int):java.util.List");
    }

    public final j H0(long j10, String str, long j11, boolean z5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        l1 l1Var = (l1) this.f15951b;
        pa.c0.f(str);
        C();
        D();
        String[] strArr = {str};
        j jVar = new j();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseR0 = r0();
                cursorQuery = sQLiteDatabaseR0.query("apps", new String[]{MetricsUnit.Duration.DAY, "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j10) {
                        jVar.f30201b = cursorQuery.getLong(1);
                        jVar.f30200a = cursorQuery.getLong(2);
                        jVar.f30202c = cursorQuery.getLong(3);
                        jVar.f30203d = cursorQuery.getLong(4);
                        jVar.f30204e = cursorQuery.getLong(5);
                        jVar.f30205f = cursorQuery.getLong(6);
                        jVar.f30206g = cursorQuery.getLong(7);
                    }
                    if (z5) {
                        jVar.f30201b += j11;
                    }
                    if (z10) {
                        jVar.f30200a += j11;
                    }
                    if (z11) {
                        jVar.f30202c += j11;
                    }
                    if (z12) {
                        jVar.f30203d += j11;
                    }
                    if (z13) {
                        jVar.f30204e += j11;
                    }
                    if (z14) {
                        jVar.f30205f += j11;
                    }
                    if (z15) {
                        jVar.f30206g += j11;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(MetricsUnit.Duration.DAY, Long.valueOf(j10));
                    contentValues.put("daily_public_events_count", Long.valueOf(jVar.f30200a));
                    contentValues.put("daily_events_count", Long.valueOf(jVar.f30201b));
                    contentValues.put("daily_conversions_count", Long.valueOf(jVar.f30202c));
                    contentValues.put("daily_error_events_count", Long.valueOf(jVar.f30203d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(jVar.f30204e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(jVar.f30205f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(jVar.f30206g));
                    sQLiteDatabaseR0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    s0 s0Var = l1Var.f30265g;
                    l1.k(s0Var);
                    s0Var.f30413j.g(s0.K(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e3) {
                s0 s0Var2 = l1Var.f30265g;
                l1.k(s0Var2);
                s0Var2.f30411g.h(s0.K(str), "Error updating daily counts. appId", e3);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return jVar;
        } catch (Throwable th2) {
            if (0 != 0) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    public final boolean I(String str) {
        q2[] q2VarArr = {q2.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(q2VarArr[0].f30372b));
        String strF0 = f0(arrayList);
        String strE0 = e0();
        return m0(om1.n(new StringBuilder((strF0.length() + 61) + strE0.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strF0, " AND NOT ", strE0), new String[]{str}) != 0;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:109), block:B:19:0x006c */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ka.k I0(java.lang.String r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f15951b
            r1 = r0
            ob.l1 r1 = (ob.l1) r1
            pa.c0.f(r12)
            r11.C()
            r11.D()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.r0()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r4 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r5 = "config_last_modified_time"
            java.lang.String r6 = "e_tag"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r0 != 0) goto L33
            goto L83
        L33:
            r0 = 0
            byte[] r0 = r3.getBlob(r0)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r4 = 1
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r5 = 2
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            boolean r6 = r3.moveToNext()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r6 == 0) goto L5e
            ob.s0 r6 = r1.f30265g     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            ob.l1.k(r6)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            com.google.android.gms.internal.ads.ur r6 = r6.f30411g     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            ob.r0 r8 = ob.s0.K(r12)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r6.g(r8, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            goto L5e
        L59:
            r0 = move-exception
            r12 = r0
            goto L6c
        L5c:
            r0 = move-exception
            goto L73
        L5e:
            if (r0 != 0) goto L61
            goto L83
        L61:
            ka.k r6 = new ka.k     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r7 = 19
            r6.<init>(r0, r4, r5, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r3.close()
            return r6
        L6c:
            r2 = r3
            goto L89
        L6e:
            r0 = move-exception
            r12 = r0
            goto L89
        L71:
            r0 = move-exception
            r3 = r2
        L73:
            ob.s0 r1 = r1.f30265g     // Catch: java.lang.Throwable -> L59
            ob.l1.k(r1)     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.ur r1 = r1.f30411g     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "Error querying remote config. appId"
            ob.r0 r12 = ob.s0.K(r12)     // Catch: java.lang.Throwable -> L59
            r1.h(r12, r4, r0)     // Catch: java.lang.Throwable -> L59
        L83:
            if (r3 == 0) goto L88
            r3.close()
        L88:
            return r2
        L89:
            if (r2 == 0) goto L8e
            r2.close()
        L8e:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.n.I0(java.lang.String):ka.k");
    }

    public final void J(Long l10) {
        l1 l1Var = (l1) this.f15951b;
        C();
        D();
        try {
            if (r0().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                s0 s0Var = l1Var.f30265g;
                l1.k(s0Var);
                s0Var.f30413j.f("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e3) {
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.f30411g.g(e3, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e3;
        }
    }

    public final void J0(com.google.android.gms.internal.measurement.l3 l3Var, boolean z5) {
        C();
        D();
        pa.c0.f(l3Var.p());
        pa.c0.l(l3Var.b2());
        M();
        l1 l1Var = (l1) this.f15951b;
        ua.a aVar = l1Var.f30269l;
        s0 s0Var = l1Var.f30265g;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jC2 = l3Var.c2();
        c0 c0Var = d0.R;
        if (jC2 < jCurrentTimeMillis - ((Long) c0Var.a(null)).longValue() || l3Var.c2() > ((Long) c0Var.a(null)).longValue() + jCurrentTimeMillis) {
            l1.k(s0Var);
            s0Var.f30413j.i("Storing bundle outside of the max uploading time span. appId, now, timestamp", s0.K(l3Var.p()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(l3Var.c2()));
        }
        byte[] bArrA = l3Var.a();
        try {
            v0 v0Var = this.f30373c.f30611h;
            z3.T(v0Var);
            byte[] bArrO0 = v0Var.o0(bArrA);
            l1.k(s0Var);
            s0Var.f30418o.g(Integer.valueOf(bArrO0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put(CommonUrlParts.APP_ID, l3Var.p());
            contentValues.put("bundle_end_timestamp", Long.valueOf(l3Var.c2()));
            contentValues.put("data", bArrO0);
            contentValues.put("has_realtime", Integer.valueOf(z5 ? 1 : 0));
            if (l3Var.p0()) {
                contentValues.put("retry_count", Integer.valueOf(l3Var.q0()));
            }
            try {
                if (r0().insert("queue", null, contentValues) == -1) {
                    l1.k(s0Var);
                    s0Var.f30411g.g(s0.K(l3Var.p()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e3) {
                l1.k(s0Var);
                s0Var.f30411g.h(s0.K(l3Var.p()), "Error storing bundle. appId", e3);
            }
        } catch (IOException e7) {
            l1.k(s0Var);
            s0Var.f30411g.h(s0.K(l3Var.p()), "Data loss. Failed to serialize bundle. appId", e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String K() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.r0()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L37
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L27
        L1e:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3d
        L22:
            r0 = move-exception
            goto L3d
        L24:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L27:
            java.lang.Object r3 = r6.f15951b     // Catch: java.lang.Throwable -> L1a
            ob.l1 r3 = (ob.l1) r3     // Catch: java.lang.Throwable -> L1a
            ob.s0 r3 = r3.f30265g     // Catch: java.lang.Throwable -> L1a
            ob.l1.k(r3)     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.ads.ur r3 = r3.f30411g     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.g(r2, r4)     // Catch: java.lang.Throwable -> L1a
        L37:
            if (r0 == 0) goto L3c
            r0.close()
        L3c:
            return r1
        L3d:
            if (r1 == 0) goto L42
            r1.close()
        L42:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.n.K():java.lang.String");
    }

    public final void L(long j10) {
        C();
        D();
        try {
            if (r0().delete("queue", "rowid=?", new String[]{String.valueOf(j10)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e3) {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30411g.g(e3, "Failed to delete a bundle in a queue table");
            throw e3;
        }
    }

    public final void M() {
        C();
        D();
        if (j0()) {
            z3 z3Var = this.f30373c;
            long jF = z3Var.f30612j.f30113f.f();
            l1 l1Var = (l1) this.f15951b;
            l1Var.f30269l.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jF) > ((Long) d0.M.a(null)).longValue()) {
                z3Var.f30612j.f30113f.g(jElapsedRealtime);
                C();
                D();
                if (j0()) {
                    SQLiteDatabase sQLiteDatabaseR0 = r0();
                    l1Var.f30269l.getClass();
                    int iDelete = sQLiteDatabaseR0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) d0.R.a(null)).longValue())});
                    if (iDelete > 0) {
                        s0 s0Var = l1Var.f30265g;
                        l1.k(s0Var);
                        s0Var.f30418o.g(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void N(ArrayList arrayList) {
        l1 l1Var = (l1) this.f15951b;
        C();
        D();
        pa.c0.i(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (j0()) {
            String strJoin = TextUtils.join(StringUtils.COMMA, arrayList);
            String strG = t.z.g(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (m0(t.z.g(new StringBuilder(strG.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strG, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                s0 s0Var = l1Var.f30265g;
                l1.k(s0Var);
                s0Var.f30413j.f("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseR0 = r0();
                StringBuilder sb2 = new StringBuilder(strG.length() + 127);
                sb2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(strG);
                sb2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseR0.execSQL(sb2.toString());
            } catch (SQLiteException e3) {
                s0 s0Var2 = l1Var.f30265g;
                l1.k(s0Var2);
                s0Var2.f30411g.g(e3, "Error incrementing retry count. error");
            }
        }
    }

    public final void O(Long l10) {
        l1 l1Var = (l1) this.f15951b;
        C();
        D();
        if (j0()) {
            StringBuilder sb2 = new StringBuilder(l10.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l10);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m0(sb2.toString(), null) > 0) {
                s0 s0Var = l1Var.f30265g;
                l1.k(s0Var);
                s0Var.f30413j.f("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseR0 = r0();
                l1Var.f30269l.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb3 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(jCurrentTimeMillis);
                String string = sb3.toString();
                StringBuilder sb4 = new StringBuilder(string.length() + 34 + l10.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(string);
                sb4.append(" WHERE rowid = ");
                sb4.append(l10);
                sb4.append(" AND retry_count < 2147483647");
                sQLiteDatabaseR0.execSQL(sb4.toString());
            } catch (SQLiteException e3) {
                s0 s0Var2 = l1Var.f30265g;
                l1.k(s0Var2);
                s0Var2.f30411g.g(e3, "Error incrementing retry count. error");
            }
        }
    }

    public final Object P(Cursor cursor, int i10) {
        l1 l1Var = (l1) this.f15951b;
        int type = cursor.getType(i10);
        if (type == 0) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30411g.f("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.f30411g.g(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        s0 s0Var3 = l1Var.f30265g;
        l1.k(s0Var3);
        s0Var3.f30411g.f("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long Q(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f15951b
            ob.l1 r0 = (ob.l1) r0
            java.lang.String r1 = "select first_open_count from app2 where app_id=?"
            pa.c0.f(r14)
            java.lang.String r2 = "first_open_count"
            pa.c0.f(r2)
            r13.C()
            r13.D()
            android.database.sqlite.SQLiteDatabase r3 = r13.r0()
            r3.beginTransaction()
            r4 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = 48
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r6.append(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String[] r6 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = -1
            long r9 = r13.n0(r1, r6, r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            java.lang.String r6 = "app2"
            java.lang.String r11 = "app_id"
            if (r1 != 0) goto L72
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r10 = "previous_install_count"
            r1.put(r10, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            r10 = 5
            long r9 = r3.insertWithOnConflict(r6, r9, r1, r10)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 != 0) goto L71
            ob.s0 r1 = r0.f30265g     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            ob.l1.k(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            com.google.android.gms.internal.ads.ur r1 = r1.f30411g     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r6 = "Failed to insert column (got -1). appId"
            ob.r0 r9 = ob.s0.K(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.h(r9, r6, r2)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            goto Lbd
        L6d:
            r14 = move-exception
            goto Lc1
        L6f:
            r1 = move-exception
            goto Lac
        L71:
            r9 = r4
        L72:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r11 = 1
            long r11 = r11 + r9
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.put(r2, r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r11 = "app_id = ?"
            java.lang.String[] r12 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = r3.update(r6, r1, r11, r12)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            long r11 = (long) r1     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 != 0) goto La6
            ob.s0 r1 = r0.f30265g     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            ob.l1.k(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            com.google.android.gms.internal.ads.ur r1 = r1.f30411g     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r4 = "Failed to update column (got 0). appId"
            ob.r0 r5 = ob.s0.K(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.h(r5, r4, r2)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            goto Lbd
        La4:
            r1 = move-exception
            goto Lab
        La6:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r7 = r9
            goto Lbd
        Lab:
            r4 = r9
        Lac:
            ob.s0 r0 = r0.f30265g     // Catch: java.lang.Throwable -> L6d
            ob.l1.k(r0)     // Catch: java.lang.Throwable -> L6d
            com.google.android.gms.internal.ads.ur r0 = r0.f30411g     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = "Error inserting column. appId"
            ob.r0 r14 = ob.s0.K(r14)     // Catch: java.lang.Throwable -> L6d
            r0.i(r6, r14, r2, r1)     // Catch: java.lang.Throwable -> L6d
            r7 = r4
        Lbd:
            r3.endTransaction()
            return r7
        Lc1:
            r3.endTransaction()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.n.Q(java.lang.String):long");
    }

    public final boolean R(String str, String str2) {
        return m0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final long S(String str) {
        pa.c0.f(str);
        return n0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void T(String str, Long l10, long j10, com.google.android.gms.internal.measurement.d3 d3Var) {
        C();
        D();
        pa.c0.i(d3Var);
        pa.c0.f(str);
        l1 l1Var = (l1) this.f15951b;
        byte[] bArrA = d3Var.a();
        s0 s0Var = l1Var.f30265g;
        s0 s0Var2 = l1Var.f30265g;
        l1.k(s0Var);
        s0Var.f30418o.h(l1Var.f30268k.a(str), "Saving complex main event, appId, data size", Integer.valueOf(bArrA.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", bArrA);
        try {
            if (r0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                l1.k(s0Var2);
                s0Var2.f30411g.g(s0.K(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e3) {
            l1.k(s0Var2);
            s0Var2.f30411g.h(s0.K(str), "Error storing complex main event. appId", e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U(java.lang.String r26, java.lang.Long r27, java.lang.String r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instruction units count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.n.U(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ob.x1 V(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f15951b
            ob.l1 r0 = (ob.l1) r0
            pa.c0.i(r5)
            r4.C()
            r4.D()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r1 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r4.r0()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            android.database.Cursor r5 = r3.rawQuery(r1, r5)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            if (r1 != 0) goto L36
            ob.s0 r1 = r0.f30265g     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            ob.l1.k(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            com.google.android.gms.internal.ads.ur r1 = r1.f30418o     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            java.lang.String r3 = "No data found"
            r1.f(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
        L2e:
            r5.close()
            goto L5c
        L32:
            r0 = move-exception
            goto L45
        L34:
            r1 = move-exception
            goto L4d
        L36:
            r1 = 0
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            r3 = 1
            int r3 = r5.getInt(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            ob.x1 r2 = ob.x1.c(r3, r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            goto L2e
        L45:
            r2 = r5
            goto L62
        L47:
            r5 = move-exception
            r0 = r5
            goto L62
        L4a:
            r5 = move-exception
            r1 = r5
            r5 = r2
        L4d:
            ob.s0 r0 = r0.f30265g     // Catch: java.lang.Throwable -> L32
            ob.l1.k(r0)     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.internal.ads.ur r0 = r0.f30411g     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "Error querying database."
            r0.g(r1, r3)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L5c
            goto L2e
        L5c:
            if (r2 != 0) goto L61
            ob.x1 r5 = ob.x1.f30509c
            return r5
        L61:
            return r2
        L62:
            if (r2 == 0) goto L67
            r2.close()
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.n.V(java.lang.String):ob.x1");
    }

    public final void W(String str, o3 o3Var) {
        C();
        D();
        pa.c0.f(str);
        l1 l1Var = (l1) this.f15951b;
        ua.a aVar = l1Var.f30269l;
        s0 s0Var = l1Var.f30265g;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c0 c0Var = d0.f30047v0;
        long jLongValue = jCurrentTimeMillis - ((Long) c0Var.a(null)).longValue();
        long j10 = o3Var.f30331c;
        if (j10 < jLongValue || j10 > ((Long) c0Var.a(null)).longValue() + jCurrentTimeMillis) {
            l1.k(s0Var);
            s0Var.f30413j.i("Storing trigger URI outside of the max retention time span. appId, now, timestamp", s0.K(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j10));
        }
        l1.k(s0Var);
        s0Var.f30418o.f("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("trigger_uri", o3Var.f30330b);
        contentValues.put("source", Integer.valueOf(o3Var.f30332d));
        contentValues.put("timestamp_millis", Long.valueOf(j10));
        try {
            if (r0().insert("trigger_uris", null, contentValues) == -1) {
                l1.k(s0Var);
                s0Var.f30411g.g(s0.K(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e3) {
            l1.k(s0Var);
            s0Var.f30411g.h(s0.K(str), "Error storing trigger URI. appId", e3);
        }
    }

    public final void X(String str, x1 x1Var) {
        pa.c0.i(str);
        pa.c0.i(x1Var);
        C();
        D();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("consent_state", x1Var.g());
        contentValues.put("consent_source", Integer.valueOf(x1Var.f30511b));
        Z(contentValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String Y(java.lang.String r4, java.lang.String[] r5) {
        /*
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.r0()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r4, r5)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            boolean r5 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            if (r5 == 0) goto L18
            r5 = 0
            java.lang.String r4 = r1.getString(r5)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            r1.close()
            return r4
        L18:
            r1.close()
            java.lang.String r4 = ""
            return r4
        L1e:
            r4 = move-exception
            goto L32
        L20:
            r5 = move-exception
            java.lang.Object r0 = r3.f15951b     // Catch: java.lang.Throwable -> L1e
            ob.l1 r0 = (ob.l1) r0     // Catch: java.lang.Throwable -> L1e
            ob.s0 r0 = r0.f30265g     // Catch: java.lang.Throwable -> L1e
            ob.l1.k(r0)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.ur r0 = r0.f30411g     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "Database error"
            r0.h(r4, r2, r5)     // Catch: java.lang.Throwable -> L1e
            throw r5     // Catch: java.lang.Throwable -> L1e
        L32:
            if (r1 == 0) goto L37
            r1.close()
        L37:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.n.Y(java.lang.String, java.lang.String[]):java.lang.String");
    }

    public final void Z(ContentValues contentValues) {
        l1 l1Var = (l1) this.f15951b;
        try {
            SQLiteDatabase sQLiteDatabaseR0 = r0();
            if (contentValues.getAsString(CommonUrlParts.APP_ID) == null) {
                s0 s0Var = l1Var.f30265g;
                l1.k(s0Var);
                s0Var.i.g(s0.K(CommonUrlParts.APP_ID), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (sQLiteDatabaseR0.update("consent_settings", contentValues, r6.toString(), new String[]{r5}) == 0 && sQLiteDatabaseR0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                s0 s0Var2 = l1Var.f30265g;
                l1.k(s0Var2);
                s0Var2.f30411g.h(s0.K("consent_settings"), "Failed to insert/update table (got -1). key", s0.K(CommonUrlParts.APP_ID));
            }
        } catch (SQLiteException e3) {
            s0 s0Var3 = l1Var.f30265g;
            l1.k(s0Var3);
            s0Var3.f30411g.i("Error storing into table. key", s0.K("consent_settings"), s0.K(CommonUrlParts.APP_ID), e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ob.s a0(java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.n.a0(java.lang.String, java.lang.String, java.lang.String):ob.s");
    }

    public final void b0(String str, s sVar) {
        l1 l1Var = (l1) this.f15951b;
        pa.c0.i(sVar);
        C();
        D();
        ContentValues contentValues = new ContentValues();
        String str2 = sVar.f30398a;
        contentValues.put(CommonUrlParts.APP_ID, str2);
        contentValues.put("name", sVar.f30399b);
        contentValues.put("lifetime_count", Long.valueOf(sVar.f30400c));
        contentValues.put("current_bundle_count", Long.valueOf(sVar.f30401d));
        contentValues.put("last_fire_timestamp", Long.valueOf(sVar.f30403f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(sVar.f30404g));
        contentValues.put("last_bundled_day", sVar.f30405h);
        contentValues.put("last_sampled_complex_event_id", sVar.i);
        contentValues.put("last_sampling_rate", sVar.f30406j);
        contentValues.put("current_session_count", Long.valueOf(sVar.f30402e));
        Boolean bool = sVar.f30407k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (r0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                s0 s0Var = l1Var.f30265g;
                l1.k(s0Var);
                s0Var.f30411g.g(s0.K(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e3) {
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.f30411g.h(s0.K(str2), "Error storing event aggregates. appId", e3);
        }
    }

    public final void c0(String str, String str2) {
        pa.c0.f(str2);
        C();
        D();
        try {
            r0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e3) {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30411g.h(s0.K(str2), "Error deleting snapshot. appId", e3);
        }
    }

    public final a4 d0(String str, long j10, byte[] bArr, String str2, String str3, int i10, int i11, long j11, long j12, long j13) {
        q2 q2Var;
        l1 l1Var = (l1) this.f15951b;
        if (TextUtils.isEmpty(str2)) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30417n.f("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.i3 i3Var = (com.google.android.gms.internal.measurement.i3) v0.p0(com.google.android.gms.internal.measurement.j3.w(), bArr);
            q2[] q2VarArrValues = q2.values();
            int length = q2VarArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    q2Var = q2.UNKNOWN;
                    break;
                }
                q2Var = q2VarArrValues[i12];
                if (q2Var.f30372b == i10) {
                    break;
                }
                i12++;
            }
            if (q2Var != q2.GOOGLE_SIGNAL && q2Var != q2.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.j3) i3Var.f13840c).p()).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.k3 k3Var = (com.google.android.gms.internal.measurement.k3) ((com.google.android.gms.internal.measurement.l3) it.next()).i();
                    k3Var.b();
                    ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).T0(i11);
                    arrayList.add((com.google.android.gms.internal.measurement.l3) k3Var.e());
                }
                i3Var.b();
                ((com.google.android.gms.internal.measurement.j3) i3Var.f13840c).B();
                i3Var.b();
                ((com.google.android.gms.internal.measurement.j3) i3Var.f13840c).A(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split("\r\n");
                int length2 = strArrSplit.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        break;
                    }
                    String str4 = strArrSplit[i13];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split("=", 2);
                    if (strArrSplit2.length != 2) {
                        s0 s0Var2 = l1Var.f30265g;
                        l1.k(s0Var2);
                        s0Var2.f30411g.g(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i13++;
                }
            }
            return new a4(j10, (com.google.android.gms.internal.measurement.j3) i3Var.e(), str2, map, q2Var, j11, j12, j13, i11);
        } catch (IOException e3) {
            s0 s0Var3 = l1Var.f30265g;
            l1.k(s0Var3);
            s0Var3.f30411g.h(str, "Failed to queued MeasurementBatch from upload_queue. appId", e3);
            return null;
        }
    }

    public final String e0() {
        ((l1) this.f15951b).f30269l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l10 = (Long) d0.S.a(null);
        l10.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l10 + ")";
        String strH = pe.a.h(gf.a.n("(upload_type != 1 AND ABS(creation_timestamp - ", ") > ", jCurrentTimeMillis), ((Long) d0.R.a(null)).longValue(), ")");
        StringBuilder sb2 = new StringBuilder(l7.o.v(str.length(), 5, strH.length(), 1));
        l7.o.t(sb2, "(", str, " OR ", strH);
        sb2.append(")");
        return sb2.toString();
    }

    public final void g0(String str, x1 x1Var) {
        pa.c0.i(str);
        C();
        D();
        X(str, V(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("storage_consent_at_bundling", x1Var.g());
        Z(contentValues);
    }

    public final x1 h0(String str) {
        pa.c0.i(str);
        C();
        D();
        return x1.c(100, Y("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final s i0(String str, com.google.android.gms.internal.measurement.d3 d3Var, String str2) {
        s sVarA0 = a0("events", str, d3Var.s());
        if (sVarA0 != null) {
            long j10 = sVarA0.f30402e + 1;
            long j11 = sVarA0.f30401d + 1;
            return new s(sVarA0.f30398a, sVarA0.f30399b, sVarA0.f30400c + 1, j11, j10, sVarA0.f30403f, sVarA0.f30404g, sVarA0.f30405h, sVarA0.i, sVarA0.f30406j, sVarA0.f30407k);
        }
        l1 l1Var = (l1) this.f15951b;
        s0 s0Var = l1Var.f30265g;
        l1.k(s0Var);
        s0Var.f30413j.h(s0.K(str), "Event aggregate wasn't created during raw event logging. appId, event", l1Var.f30268k.a(str2));
        return new s(str, d3Var.s(), 1L, 1L, 1L, d3Var.u(), 0L, null, null, null, null);
    }

    public final boolean j0() {
        return ((l1) this.f15951b).f30260b.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8 A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TRY_LEAVE, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(java.lang.String r21, long r22, long r24, com.google.android.gms.internal.ads.oq r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.n.k0(java.lang.String, long, long, com.google.android.gms.internal.ads.oq):void");
    }

    public final long m0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = r0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e3) {
                s0 s0Var = ((l1) this.f15951b).f30265g;
                l1.k(s0Var);
                s0Var.f30411g.h(str, "Database error", e3);
                throw e3;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long n0(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = r0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j10 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e3) {
                s0 s0Var = ((l1) this.f15951b).f30265g;
                l1.k(s0Var);
                s0Var.f30411g.h(str, "Database error", e3);
                throw e3;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public final void o0() {
        D();
        r0().beginTransaction();
    }

    public final void p0() {
        D();
        r0().setTransactionSuccessful();
    }

    public final void q0() {
        D();
        r0().endTransaction();
    }

    public final SQLiteDatabase r0() {
        C();
        try {
            return this.f30306e.getWritableDatabase();
        } catch (SQLiteException e3) {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30413j.g(e3, "Error opening database");
            throw e3;
        }
    }

    public final void s0(String str) {
        s sVarA0;
        c0("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = r0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (sVarA0 = a0("events", str, string)) != null) {
                            b0("events_snapshot", sVarA0);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e3) {
                s0 s0Var = ((l1) this.f15951b).f30265g;
                l1.k(s0Var);
                s0Var.f30411g.h(s0.K(str), "Error creating snapshot. appId", e3);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t0(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.n.t0(java.lang.String):void");
    }

    public final void u0(String str, String str2) {
        pa.c0.f(str);
        pa.c0.f(str2);
        C();
        D();
        try {
            r0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e3) {
            l1 l1Var = (l1) this.f15951b;
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30411g.i("Error deleting user property. appId", s0.K(str), l1Var.f30268k.c(str2), e3);
        }
    }

    public final boolean v0(c4 c4Var) {
        l1 l1Var = (l1) this.f15951b;
        String str = c4Var.f29989b;
        C();
        D();
        String str2 = c4Var.f29988a;
        String str3 = c4Var.f29990c;
        if (w0(str2, str3) == null) {
            if (e4.z0(str3)) {
                if (m0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(l1Var.f30263e.K(str2, d0.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jM0 = m0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                l1Var.getClass();
                if (jM0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(c4Var.f29991d));
        l0(contentValues, c4Var.f29992e);
        try {
            if (r0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30411g.g(s0.K(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e3) {
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.f30411g.h(s0.K(str2), "Error storing user property. appId", e3);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ob.c4 w0(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f15951b
            r1 = r0
            ob.l1 r1 = (ob.l1) r1
            pa.c0.f(r12)
            pa.c0.f(r13)
            r11.C()
            r11.D()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.r0()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r4 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r5 = "value"
            java.lang.String r6 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r6 = "app_id=? and name=?"
            java.lang.String[] r7 = new java.lang.String[]{r12, r13}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L37
            goto L95
        L37:
            r0 = 0
            long r8 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r0 = 1
            java.lang.Object r10 = r11.P(r3, r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r10 != 0) goto L44
            goto L95
        L44:
            r0 = 2
            java.lang.String r6 = r3.getString(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            ob.c4 r4 = new ob.c4     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r5 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r12 = r3.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r12 == 0) goto L6d
            ob.s0 r12 = r1.f30265g     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            ob.l1.k(r12)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            com.google.android.gms.internal.ads.ur r12 = r12.f30411g     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r13 = "Got multiple records for user property, expected one. appId"
            ob.r0 r0 = ob.s0.K(r5)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r12.g(r0, r13)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            goto L6d
        L67:
            r0 = move-exception
            r12 = r0
            goto L75
        L6a:
            r0 = move-exception
        L6b:
            r12 = r0
            goto L7f
        L6d:
            r3.close()
            return r4
        L71:
            r0 = move-exception
            r5 = r12
            r7 = r13
            goto L6b
        L75:
            r2 = r3
            goto L9b
        L77:
            r0 = move-exception
            r12 = r0
            goto L9b
        L7a:
            r0 = move-exception
            r5 = r12
            r7 = r13
            r12 = r0
            r3 = r2
        L7f:
            ob.s0 r13 = r1.f30265g     // Catch: java.lang.Throwable -> L67
            ob.l1.k(r13)     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.internal.ads.ur r13 = r13.f30411g     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "Error querying user property. appId"
            ob.r0 r4 = ob.s0.K(r5)     // Catch: java.lang.Throwable -> L67
            ob.o0 r1 = r1.f30268k     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r1.c(r7)     // Catch: java.lang.Throwable -> L67
            r13.i(r0, r4, r1, r12)     // Catch: java.lang.Throwable -> L67
        L95:
            if (r3 == 0) goto L9a
            r3.close()
        L9a:
            return r2
        L9b:
            if (r2 == 0) goto La0
            r2.close()
        La0:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.n.w0(java.lang.String, java.lang.String):ob.c4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List x0(String str) {
        String str2;
        l1 l1Var = (l1) this.f15951b;
        pa.c0.f(str);
        C();
        D();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                l1Var.getClass();
                cursorQuery = r0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursorQuery.moveToFirst()) {
                        while (true) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j10 = cursorQuery.getLong(2);
                            Object objP = P(cursorQuery, 3);
                            if (objP == null) {
                                s0 s0Var = l1Var.f30265g;
                                l1.k(s0Var);
                                s0Var.f30411g.g(s0.K(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } else {
                                str2 = str;
                                try {
                                    arrayList.add(new c4(str2, str3, string, j10, objP));
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    s0 s0Var2 = l1Var.f30265g;
                                    l1.k(s0Var2);
                                    s0Var2.f30411g.h(s0.K(str2), "Error querying user properties. appId", e);
                                    arrayList = Collections.EMPTY_LIST;
                                }
                            }
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        }
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    str2 = str;
                }
            } catch (SQLiteException e10) {
                e = e10;
                str2 = str;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        ob.l1.k(r13);
        r13.f30411g.g(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List y0(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.n.y0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean z0(e eVar) {
        l1 l1Var = (l1) this.f15951b;
        C();
        D();
        String str = eVar.f30073b;
        pa.c0.i(str);
        if (w0(str, eVar.f30075d.f29965c) == null) {
            long jM0 = m0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            l1Var.getClass();
            if (jM0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("origin", eVar.f30074c);
        contentValues.put("name", eVar.f30075d.f29965c);
        Object objH = eVar.f30075d.h();
        pa.c0.i(objH);
        l0(contentValues, objH);
        contentValues.put("active", Boolean.valueOf(eVar.f30077f));
        contentValues.put("trigger_event_name", eVar.f30078g);
        contentValues.put("trigger_timeout", Long.valueOf(eVar.i));
        v vVar = eVar.f30079h;
        e4 e4Var = l1Var.f30267j;
        s0 s0Var = l1Var.f30265g;
        l1.h(e4Var);
        contentValues.put("timed_out_event", e4.f0(vVar));
        contentValues.put("creation_timestamp", Long.valueOf(eVar.f30076e));
        l1.h(e4Var);
        contentValues.put("triggered_event", e4.f0(eVar.f30080j));
        contentValues.put("triggered_timestamp", Long.valueOf(eVar.f30075d.f29966d));
        contentValues.put("time_to_live", Long.valueOf(eVar.f30081k));
        contentValues.put("expired_event", e4.f0(eVar.f30082l));
        try {
            if (r0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            l1.k(s0Var);
            s0Var.f30411g.g(s0.K(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e3) {
            l1.k(s0Var);
            s0Var.f30411g.h(s0.K(str), "Error storing conditional user property", e3);
            return true;
        }
    }

    @Override // ob.u3
    public final void F() {
    }
}
