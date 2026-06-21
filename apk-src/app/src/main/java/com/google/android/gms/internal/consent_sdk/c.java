package com.google.android.gms.internal.consent_sdk;

import a0.y;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import androidx.work.impl.WorkDatabase_Impl;
import com.appsflyer.AdRevenueScheme;
import com.google.android.gms.internal.ads.at0;
import com.google.android.gms.internal.ads.bh;
import com.google.android.gms.internal.ads.bl;
import com.google.android.gms.internal.ads.by0;
import com.google.android.gms.internal.ads.cq0;
import com.google.android.gms.internal.ads.cw;
import com.google.android.gms.internal.ads.dl;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.ads.eq0;
import com.google.android.gms.internal.ads.ew1;
import com.google.android.gms.internal.ads.f80;
import com.google.android.gms.internal.ads.gr;
import com.google.android.gms.internal.ads.ht1;
import com.google.android.gms.internal.ads.hv1;
import com.google.android.gms.internal.ads.hw1;
import com.google.android.gms.internal.ads.in0;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.jd;
import com.google.android.gms.internal.ads.jv1;
import com.google.android.gms.internal.ads.jx1;
import com.google.android.gms.internal.ads.kv1;
import com.google.android.gms.internal.ads.l81;
import com.google.android.gms.internal.ads.ll0;
import com.google.android.gms.internal.ads.n90;
import com.google.android.gms.internal.ads.nz;
import com.google.android.gms.internal.ads.of0;
import com.google.android.gms.internal.ads.oj0;
import com.google.android.gms.internal.ads.om0;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.ot1;
import com.google.android.gms.internal.ads.ov1;
import com.google.android.gms.internal.ads.pv1;
import com.google.android.gms.internal.ads.qv1;
import com.google.android.gms.internal.ads.ra;
import com.google.android.gms.internal.ads.rm0;
import com.google.android.gms.internal.ads.rv1;
import com.google.android.gms.internal.ads.s50;
import com.google.android.gms.internal.ads.sv1;
import com.google.android.gms.internal.ads.t40;
import com.google.android.gms.internal.ads.uf0;
import com.google.android.gms.internal.ads.vv;
import com.google.android.gms.internal.ads.x10;
import com.google.android.gms.internal.ads.xo0;
import com.google.android.gms.internal.ads.xp0;
import com.google.android.gms.internal.ads.yi0;
import com.google.android.gms.internal.ads.ym0;
import com.google.android.gms.internal.ads.zh0;
import com.google.android.gms.internal.ads.zz;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.ProfilingTraceData;
import io.sentry.SentryEvent;
import io.sentry.SentryLockReason;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Device;
import io.sentry.protocol.SentryThread;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import y8.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static c f13336j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f13337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f13341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f13342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f13343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f13344h;
    public Object i;

    public c(Application application) {
        this.f13337a = this;
        d6 d6Var = new d6(8, application);
        this.f13338b = d6Var;
        g7 g7VarA = g7.a(new e(d6Var, 1));
        this.f13339c = g7VarA;
        g7 g7VarA2 = g7.a(b0.f13334b);
        this.f13340d = g7VarA2;
        g7 g7VarA3 = g7.a(new d6(3, new b(this)));
        this.f13341e = g7VarA3;
        h4 h4Var = new h4(d6Var, g7VarA, 1);
        g7 g7VarA4 = g7.a(new m4(24));
        this.f13342f = g7VarA4;
        f fVar = new f(d6Var, g7VarA, g7.a(new h4(d6Var, g7.a(new e(d6Var, 0)), 0)));
        this.i = fVar;
        g7 g7VarA5 = g7.a(new ka.k(g7VarA2, d6Var, g7.a(new e(d6Var, 2)), 6));
        this.f13343g = g7VarA5;
        this.f13344h = g7.a(new s7.g(g7VarA, new zz(d6Var, g7VarA2, g7VarA, g7VarA3, h4Var, new com.google.firebase.messaging.y(g7VarA4, fVar, g7VarA, g7VarA5), g7VarA4, g7VarA5), g7VarA3, g7VarA5));
    }

    public static c r(Context context) {
        c cVar;
        synchronized (c.class) {
            try {
                if (f13336j == null) {
                    Application application = (Application) context.getApplicationContext();
                    application.getClass();
                    f13336j = new c(application);
                }
                cVar = f13336j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public ArrayList a() throws Throwable {
        l6.j jVar;
        int iO;
        int iO2;
        int iO3;
        int iO4;
        int iO5;
        int iO6;
        int iO7;
        int iO8;
        int iO9;
        int iO10;
        int iO11;
        int iO12;
        int iO13;
        l6.j jVarD = l6.j.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        jVarD.h(1, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13337a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(jVarD);
        try {
            iO = k3.f.o(cursorG, "required_network_type");
            iO2 = k3.f.o(cursorG, "requires_charging");
            iO3 = k3.f.o(cursorG, "requires_device_idle");
            iO4 = k3.f.o(cursorG, "requires_battery_not_low");
            iO5 = k3.f.o(cursorG, "requires_storage_not_low");
            iO6 = k3.f.o(cursorG, "trigger_content_update_delay");
            iO7 = k3.f.o(cursorG, "trigger_max_content_delay");
            iO8 = k3.f.o(cursorG, "content_uri_triggers");
            iO9 = k3.f.o(cursorG, "id");
            iO10 = k3.f.o(cursorG, SentryThread.JsonKeys.STATE);
            iO11 = k3.f.o(cursorG, "worker_class_name");
            iO12 = k3.f.o(cursorG, "input_merger_class_name");
            iO13 = k3.f.o(cursorG, "input");
            jVar = jVarD;
        } catch (Throwable th2) {
            th = th2;
            jVar = jVarD;
        }
        try {
            int iO14 = k3.f.o(cursorG, "output");
            int iO15 = k3.f.o(cursorG, "initial_delay");
            int iO16 = k3.f.o(cursorG, "interval_duration");
            int iO17 = k3.f.o(cursorG, "flex_duration");
            int iO18 = k3.f.o(cursorG, "run_attempt_count");
            int iO19 = k3.f.o(cursorG, "backoff_policy");
            int iO20 = k3.f.o(cursorG, "backoff_delay_duration");
            int iO21 = k3.f.o(cursorG, "period_start_time");
            int iO22 = k3.f.o(cursorG, "minimum_retention_duration");
            int iO23 = k3.f.o(cursorG, "schedule_requested_at");
            int iO24 = k3.f.o(cursorG, "run_in_foreground");
            int iO25 = k3.f.o(cursorG, "out_of_quota_policy");
            int i = iO14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iO9);
                int i10 = iO9;
                String string2 = cursorG.getString(iO11);
                int i11 = iO11;
                l7.c cVar = new l7.c();
                int i12 = iO;
                cVar.f28011a = com.google.android.gms.internal.auth.m.k(cursorG.getInt(iO));
                cVar.f28012b = cursorG.getInt(iO2) != 0;
                cVar.f28013c = cursorG.getInt(iO3) != 0;
                cVar.f28014d = cursorG.getInt(iO4) != 0;
                cVar.f28015e = cursorG.getInt(iO5) != 0;
                int i13 = iO2;
                cVar.f28016f = cursorG.getLong(iO6);
                cVar.f28017g = cursorG.getLong(iO7);
                cVar.f28018h = com.google.android.gms.internal.auth.m.b(cursorG.getBlob(iO8));
                u7.j jVar2 = new u7.j(string, string2);
                jVar2.f34331b = com.google.android.gms.internal.auth.m.m(cursorG.getInt(iO10));
                jVar2.f34333d = cursorG.getString(iO12);
                jVar2.f34334e = l7.f.a(cursorG.getBlob(iO13));
                int i14 = i;
                jVar2.f34335f = l7.f.a(cursorG.getBlob(i14));
                int i15 = iO13;
                i = i14;
                int i16 = iO15;
                jVar2.f34336g = cursorG.getLong(i16);
                iO15 = i16;
                int i17 = iO3;
                int i18 = iO16;
                jVar2.f34337h = cursorG.getLong(i18);
                iO16 = i18;
                int i19 = iO17;
                jVar2.i = cursorG.getLong(i19);
                int i20 = iO18;
                jVar2.f34339k = cursorG.getInt(i20);
                int i21 = iO19;
                iO18 = i20;
                jVar2.f34340l = com.google.android.gms.internal.auth.m.j(cursorG.getInt(i21));
                iO17 = i19;
                int i22 = iO20;
                jVar2.f34341m = cursorG.getLong(i22);
                iO20 = i22;
                int i23 = iO21;
                jVar2.f34342n = cursorG.getLong(i23);
                iO21 = i23;
                int i24 = iO22;
                jVar2.f34343o = cursorG.getLong(i24);
                iO22 = i24;
                int i25 = iO23;
                jVar2.f34344p = cursorG.getLong(i25);
                int i26 = iO24;
                jVar2.f34345q = cursorG.getInt(i26) != 0;
                int i27 = iO25;
                iO24 = i26;
                jVar2.f34346r = com.google.android.gms.internal.auth.m.l(cursorG.getInt(i27));
                jVar2.f34338j = cVar;
                arrayList.add(jVar2);
                iO19 = i21;
                iO3 = i17;
                iO25 = i27;
                iO23 = i25;
                iO13 = i15;
                iO9 = i10;
                iO11 = i11;
                iO = i12;
                iO2 = i13;
            }
            cursorG.close();
            jVar.k();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorG.close();
            jVar.k();
            throw th;
        }
    }

    public ArrayList b(int i) throws Throwable {
        l6.j jVar;
        l6.j jVarD = l6.j.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        jVarD.h(1, i);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13337a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(jVarD);
        try {
            int iO = k3.f.o(cursorG, "required_network_type");
            int iO2 = k3.f.o(cursorG, "requires_charging");
            int iO3 = k3.f.o(cursorG, "requires_device_idle");
            int iO4 = k3.f.o(cursorG, "requires_battery_not_low");
            int iO5 = k3.f.o(cursorG, "requires_storage_not_low");
            int iO6 = k3.f.o(cursorG, "trigger_content_update_delay");
            int iO7 = k3.f.o(cursorG, "trigger_max_content_delay");
            int iO8 = k3.f.o(cursorG, "content_uri_triggers");
            int iO9 = k3.f.o(cursorG, "id");
            int iO10 = k3.f.o(cursorG, SentryThread.JsonKeys.STATE);
            int iO11 = k3.f.o(cursorG, "worker_class_name");
            int iO12 = k3.f.o(cursorG, "input_merger_class_name");
            int iO13 = k3.f.o(cursorG, "input");
            jVar = jVarD;
            try {
                int iO14 = k3.f.o(cursorG, "output");
                int iO15 = k3.f.o(cursorG, "initial_delay");
                int iO16 = k3.f.o(cursorG, "interval_duration");
                int iO17 = k3.f.o(cursorG, "flex_duration");
                int iO18 = k3.f.o(cursorG, "run_attempt_count");
                int iO19 = k3.f.o(cursorG, "backoff_policy");
                int iO20 = k3.f.o(cursorG, "backoff_delay_duration");
                int iO21 = k3.f.o(cursorG, "period_start_time");
                int iO22 = k3.f.o(cursorG, "minimum_retention_duration");
                int iO23 = k3.f.o(cursorG, "schedule_requested_at");
                int iO24 = k3.f.o(cursorG, "run_in_foreground");
                int iO25 = k3.f.o(cursorG, "out_of_quota_policy");
                int i10 = iO14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iO9);
                    int i11 = iO9;
                    String string2 = cursorG.getString(iO11);
                    int i12 = iO11;
                    l7.c cVar = new l7.c();
                    int i13 = iO;
                    cVar.f28011a = com.google.android.gms.internal.auth.m.k(cursorG.getInt(iO));
                    cVar.f28012b = cursorG.getInt(iO2) != 0;
                    cVar.f28013c = cursorG.getInt(iO3) != 0;
                    cVar.f28014d = cursorG.getInt(iO4) != 0;
                    cVar.f28015e = cursorG.getInt(iO5) != 0;
                    int i14 = iO2;
                    cVar.f28016f = cursorG.getLong(iO6);
                    cVar.f28017g = cursorG.getLong(iO7);
                    cVar.f28018h = com.google.android.gms.internal.auth.m.b(cursorG.getBlob(iO8));
                    u7.j jVar2 = new u7.j(string, string2);
                    jVar2.f34331b = com.google.android.gms.internal.auth.m.m(cursorG.getInt(iO10));
                    jVar2.f34333d = cursorG.getString(iO12);
                    jVar2.f34334e = l7.f.a(cursorG.getBlob(iO13));
                    int i15 = i10;
                    jVar2.f34335f = l7.f.a(cursorG.getBlob(i15));
                    int i16 = iO15;
                    int i17 = iO13;
                    i10 = i15;
                    jVar2.f34336g = cursorG.getLong(i16);
                    int i18 = iO3;
                    int i19 = iO16;
                    jVar2.f34337h = cursorG.getLong(i19);
                    iO16 = i19;
                    int i20 = iO17;
                    jVar2.i = cursorG.getLong(i20);
                    int i21 = iO18;
                    jVar2.f34339k = cursorG.getInt(i21);
                    int i22 = iO19;
                    iO18 = i21;
                    jVar2.f34340l = com.google.android.gms.internal.auth.m.j(cursorG.getInt(i22));
                    iO17 = i20;
                    int i23 = iO20;
                    jVar2.f34341m = cursorG.getLong(i23);
                    iO20 = i23;
                    int i24 = iO21;
                    jVar2.f34342n = cursorG.getLong(i24);
                    iO21 = i24;
                    int i25 = iO22;
                    jVar2.f34343o = cursorG.getLong(i25);
                    iO22 = i25;
                    int i26 = iO23;
                    jVar2.f34344p = cursorG.getLong(i26);
                    int i27 = iO24;
                    jVar2.f34345q = cursorG.getInt(i27) != 0;
                    int i28 = iO25;
                    iO24 = i27;
                    jVar2.f34346r = com.google.android.gms.internal.auth.m.l(cursorG.getInt(i28));
                    jVar2.f34338j = cVar;
                    arrayList.add(jVar2);
                    iO19 = i22;
                    iO3 = i18;
                    iO13 = i17;
                    iO25 = i28;
                    iO23 = i26;
                    iO15 = i16;
                    iO9 = i11;
                    iO11 = i12;
                    iO = i13;
                    iO2 = i14;
                }
                cursorG.close();
                jVar.k();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorG.close();
                jVar.k();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            jVar = jVarD;
        }
    }

    public ArrayList c() throws Throwable {
        l6.j jVar;
        l6.j jVarD = l6.j.d(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13337a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(jVarD);
        try {
            int iO = k3.f.o(cursorG, "required_network_type");
            int iO2 = k3.f.o(cursorG, "requires_charging");
            int iO3 = k3.f.o(cursorG, "requires_device_idle");
            int iO4 = k3.f.o(cursorG, "requires_battery_not_low");
            int iO5 = k3.f.o(cursorG, "requires_storage_not_low");
            int iO6 = k3.f.o(cursorG, "trigger_content_update_delay");
            int iO7 = k3.f.o(cursorG, "trigger_max_content_delay");
            int iO8 = k3.f.o(cursorG, "content_uri_triggers");
            int iO9 = k3.f.o(cursorG, "id");
            int iO10 = k3.f.o(cursorG, SentryThread.JsonKeys.STATE);
            int iO11 = k3.f.o(cursorG, "worker_class_name");
            int iO12 = k3.f.o(cursorG, "input_merger_class_name");
            int iO13 = k3.f.o(cursorG, "input");
            jVar = jVarD;
            try {
                int iO14 = k3.f.o(cursorG, "output");
                int iO15 = k3.f.o(cursorG, "initial_delay");
                int iO16 = k3.f.o(cursorG, "interval_duration");
                int iO17 = k3.f.o(cursorG, "flex_duration");
                int iO18 = k3.f.o(cursorG, "run_attempt_count");
                int iO19 = k3.f.o(cursorG, "backoff_policy");
                int iO20 = k3.f.o(cursorG, "backoff_delay_duration");
                int iO21 = k3.f.o(cursorG, "period_start_time");
                int iO22 = k3.f.o(cursorG, "minimum_retention_duration");
                int iO23 = k3.f.o(cursorG, "schedule_requested_at");
                int iO24 = k3.f.o(cursorG, "run_in_foreground");
                int iO25 = k3.f.o(cursorG, "out_of_quota_policy");
                int i = iO14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iO9);
                    int i10 = iO9;
                    String string2 = cursorG.getString(iO11);
                    int i11 = iO11;
                    l7.c cVar = new l7.c();
                    int i12 = iO;
                    cVar.f28011a = com.google.android.gms.internal.auth.m.k(cursorG.getInt(iO));
                    cVar.f28012b = cursorG.getInt(iO2) != 0;
                    cVar.f28013c = cursorG.getInt(iO3) != 0;
                    cVar.f28014d = cursorG.getInt(iO4) != 0;
                    cVar.f28015e = cursorG.getInt(iO5) != 0;
                    int i13 = iO2;
                    cVar.f28016f = cursorG.getLong(iO6);
                    cVar.f28017g = cursorG.getLong(iO7);
                    cVar.f28018h = com.google.android.gms.internal.auth.m.b(cursorG.getBlob(iO8));
                    u7.j jVar2 = new u7.j(string, string2);
                    jVar2.f34331b = com.google.android.gms.internal.auth.m.m(cursorG.getInt(iO10));
                    jVar2.f34333d = cursorG.getString(iO12);
                    jVar2.f34334e = l7.f.a(cursorG.getBlob(iO13));
                    int i14 = i;
                    jVar2.f34335f = l7.f.a(cursorG.getBlob(i14));
                    int i15 = iO13;
                    i = i14;
                    int i16 = iO15;
                    jVar2.f34336g = cursorG.getLong(i16);
                    iO15 = i16;
                    int i17 = iO3;
                    int i18 = iO16;
                    jVar2.f34337h = cursorG.getLong(i18);
                    iO16 = i18;
                    int i19 = iO17;
                    jVar2.i = cursorG.getLong(i19);
                    int i20 = iO18;
                    jVar2.f34339k = cursorG.getInt(i20);
                    int i21 = iO19;
                    iO18 = i20;
                    jVar2.f34340l = com.google.android.gms.internal.auth.m.j(cursorG.getInt(i21));
                    iO17 = i19;
                    int i22 = iO20;
                    jVar2.f34341m = cursorG.getLong(i22);
                    iO20 = i22;
                    int i23 = iO21;
                    jVar2.f34342n = cursorG.getLong(i23);
                    iO21 = i23;
                    int i24 = iO22;
                    jVar2.f34343o = cursorG.getLong(i24);
                    iO22 = i24;
                    int i25 = iO23;
                    jVar2.f34344p = cursorG.getLong(i25);
                    int i26 = iO24;
                    jVar2.f34345q = cursorG.getInt(i26) != 0;
                    int i27 = iO25;
                    iO24 = i26;
                    jVar2.f34346r = com.google.android.gms.internal.auth.m.l(cursorG.getInt(i27));
                    jVar2.f34338j = cVar;
                    arrayList.add(jVar2);
                    iO19 = i21;
                    iO3 = i17;
                    iO25 = i27;
                    iO23 = i25;
                    iO13 = i15;
                    iO9 = i10;
                    iO11 = i11;
                    iO = i12;
                    iO2 = i13;
                }
                cursorG.close();
                jVar.k();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorG.close();
                jVar.k();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            jVar = jVarD;
        }
    }

    public ArrayList d() {
        l6.j jVar;
        l6.j jVarD = l6.j.d(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13337a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(jVarD);
        try {
            int iO = k3.f.o(cursorG, "required_network_type");
            int iO2 = k3.f.o(cursorG, "requires_charging");
            int iO3 = k3.f.o(cursorG, "requires_device_idle");
            int iO4 = k3.f.o(cursorG, "requires_battery_not_low");
            int iO5 = k3.f.o(cursorG, "requires_storage_not_low");
            int iO6 = k3.f.o(cursorG, "trigger_content_update_delay");
            int iO7 = k3.f.o(cursorG, "trigger_max_content_delay");
            int iO8 = k3.f.o(cursorG, "content_uri_triggers");
            int iO9 = k3.f.o(cursorG, "id");
            int iO10 = k3.f.o(cursorG, SentryThread.JsonKeys.STATE);
            int iO11 = k3.f.o(cursorG, "worker_class_name");
            int iO12 = k3.f.o(cursorG, "input_merger_class_name");
            int iO13 = k3.f.o(cursorG, "input");
            jVar = jVarD;
            try {
                int iO14 = k3.f.o(cursorG, "output");
                int iO15 = k3.f.o(cursorG, "initial_delay");
                int iO16 = k3.f.o(cursorG, "interval_duration");
                int iO17 = k3.f.o(cursorG, "flex_duration");
                int iO18 = k3.f.o(cursorG, "run_attempt_count");
                int iO19 = k3.f.o(cursorG, "backoff_policy");
                int iO20 = k3.f.o(cursorG, "backoff_delay_duration");
                int iO21 = k3.f.o(cursorG, "period_start_time");
                int iO22 = k3.f.o(cursorG, "minimum_retention_duration");
                int iO23 = k3.f.o(cursorG, "schedule_requested_at");
                int iO24 = k3.f.o(cursorG, "run_in_foreground");
                int iO25 = k3.f.o(cursorG, "out_of_quota_policy");
                int i = iO14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iO9);
                    int i10 = iO9;
                    String string2 = cursorG.getString(iO11);
                    int i11 = iO11;
                    l7.c cVar = new l7.c();
                    int i12 = iO;
                    cVar.f28011a = com.google.android.gms.internal.auth.m.k(cursorG.getInt(iO));
                    cVar.f28012b = cursorG.getInt(iO2) != 0;
                    cVar.f28013c = cursorG.getInt(iO3) != 0;
                    cVar.f28014d = cursorG.getInt(iO4) != 0;
                    cVar.f28015e = cursorG.getInt(iO5) != 0;
                    int i13 = iO2;
                    cVar.f28016f = cursorG.getLong(iO6);
                    cVar.f28017g = cursorG.getLong(iO7);
                    cVar.f28018h = com.google.android.gms.internal.auth.m.b(cursorG.getBlob(iO8));
                    u7.j jVar2 = new u7.j(string, string2);
                    jVar2.f34331b = com.google.android.gms.internal.auth.m.m(cursorG.getInt(iO10));
                    jVar2.f34333d = cursorG.getString(iO12);
                    jVar2.f34334e = l7.f.a(cursorG.getBlob(iO13));
                    int i14 = i;
                    jVar2.f34335f = l7.f.a(cursorG.getBlob(i14));
                    int i15 = iO13;
                    i = i14;
                    int i16 = iO15;
                    jVar2.f34336g = cursorG.getLong(i16);
                    iO15 = i16;
                    int i17 = iO3;
                    int i18 = iO16;
                    jVar2.f34337h = cursorG.getLong(i18);
                    iO16 = i18;
                    int i19 = iO17;
                    jVar2.i = cursorG.getLong(i19);
                    int i20 = iO18;
                    jVar2.f34339k = cursorG.getInt(i20);
                    int i21 = iO19;
                    iO18 = i20;
                    jVar2.f34340l = com.google.android.gms.internal.auth.m.j(cursorG.getInt(i21));
                    iO17 = i19;
                    int i22 = iO20;
                    jVar2.f34341m = cursorG.getLong(i22);
                    iO20 = i22;
                    int i23 = iO21;
                    jVar2.f34342n = cursorG.getLong(i23);
                    iO21 = i23;
                    int i24 = iO22;
                    jVar2.f34343o = cursorG.getLong(i24);
                    iO22 = i24;
                    int i25 = iO23;
                    jVar2.f34344p = cursorG.getLong(i25);
                    int i26 = iO24;
                    jVar2.f34345q = cursorG.getInt(i26) != 0;
                    int i27 = iO25;
                    iO24 = i26;
                    jVar2.f34346r = com.google.android.gms.internal.auth.m.l(cursorG.getInt(i27));
                    jVar2.f34338j = cVar;
                    arrayList.add(jVar2);
                    iO19 = i21;
                    iO3 = i17;
                    iO25 = i27;
                    iO23 = i25;
                    iO13 = i15;
                    iO9 = i10;
                    iO11 = i11;
                    iO = i12;
                    iO2 = i13;
                }
                cursorG.close();
                jVar.k();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorG.close();
                jVar.k();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            jVar = jVarD;
        }
    }

    public int e(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13337a;
        l6.j jVarD = l6.j.d(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            jVarD.i(1);
        } else {
            jVarD.j(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(jVarD);
        try {
            return cursorG.moveToFirst() ? com.google.android.gms.internal.auth.m.m(cursorG.getInt(0)) : 0;
        } finally {
            cursorG.close();
            jVarD.k();
        }
    }

    public ArrayList f() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13337a;
        l6.j jVarD = l6.j.d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        jVarD.i(1);
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(jVarD);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            jVarD.k();
        }
    }

    public ArrayList g() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13337a;
        l6.j jVarD = l6.j.d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        jVarD.j(1, "offline_ping_sender_work");
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(jVarD);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            jVarD.k();
        }
    }

    public u7.j h(String str) {
        l6.j jVar;
        u7.j jVar2;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13337a;
        l6.j jVarD = l6.j.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            jVarD.i(1);
        } else {
            jVarD.j(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(jVarD);
        try {
            int iO = k3.f.o(cursorG, "required_network_type");
            int iO2 = k3.f.o(cursorG, "requires_charging");
            int iO3 = k3.f.o(cursorG, "requires_device_idle");
            int iO4 = k3.f.o(cursorG, "requires_battery_not_low");
            int iO5 = k3.f.o(cursorG, "requires_storage_not_low");
            int iO6 = k3.f.o(cursorG, "trigger_content_update_delay");
            int iO7 = k3.f.o(cursorG, "trigger_max_content_delay");
            int iO8 = k3.f.o(cursorG, "content_uri_triggers");
            int iO9 = k3.f.o(cursorG, "id");
            int iO10 = k3.f.o(cursorG, SentryThread.JsonKeys.STATE);
            int iO11 = k3.f.o(cursorG, "worker_class_name");
            int iO12 = k3.f.o(cursorG, "input_merger_class_name");
            int iO13 = k3.f.o(cursorG, "input");
            int iO14 = k3.f.o(cursorG, "output");
            jVar = jVarD;
            try {
                int iO15 = k3.f.o(cursorG, "initial_delay");
                int iO16 = k3.f.o(cursorG, "interval_duration");
                int iO17 = k3.f.o(cursorG, "flex_duration");
                int iO18 = k3.f.o(cursorG, "run_attempt_count");
                int iO19 = k3.f.o(cursorG, "backoff_policy");
                int iO20 = k3.f.o(cursorG, "backoff_delay_duration");
                int iO21 = k3.f.o(cursorG, "period_start_time");
                int iO22 = k3.f.o(cursorG, "minimum_retention_duration");
                int iO23 = k3.f.o(cursorG, "schedule_requested_at");
                int iO24 = k3.f.o(cursorG, "run_in_foreground");
                int iO25 = k3.f.o(cursorG, "out_of_quota_policy");
                if (cursorG.moveToFirst()) {
                    String string = cursorG.getString(iO9);
                    String string2 = cursorG.getString(iO11);
                    l7.c cVar = new l7.c();
                    cVar.f28011a = com.google.android.gms.internal.auth.m.k(cursorG.getInt(iO));
                    cVar.f28012b = cursorG.getInt(iO2) != 0;
                    cVar.f28013c = cursorG.getInt(iO3) != 0;
                    cVar.f28014d = cursorG.getInt(iO4) != 0;
                    cVar.f28015e = cursorG.getInt(iO5) != 0;
                    cVar.f28016f = cursorG.getLong(iO6);
                    cVar.f28017g = cursorG.getLong(iO7);
                    cVar.f28018h = com.google.android.gms.internal.auth.m.b(cursorG.getBlob(iO8));
                    jVar2 = new u7.j(string, string2);
                    jVar2.f34331b = com.google.android.gms.internal.auth.m.m(cursorG.getInt(iO10));
                    jVar2.f34333d = cursorG.getString(iO12);
                    jVar2.f34334e = l7.f.a(cursorG.getBlob(iO13));
                    jVar2.f34335f = l7.f.a(cursorG.getBlob(iO14));
                    jVar2.f34336g = cursorG.getLong(iO15);
                    jVar2.f34337h = cursorG.getLong(iO16);
                    jVar2.i = cursorG.getLong(iO17);
                    jVar2.f34339k = cursorG.getInt(iO18);
                    jVar2.f34340l = com.google.android.gms.internal.auth.m.j(cursorG.getInt(iO19));
                    jVar2.f34341m = cursorG.getLong(iO20);
                    jVar2.f34342n = cursorG.getLong(iO21);
                    jVar2.f34343o = cursorG.getLong(iO22);
                    jVar2.f34344p = cursorG.getLong(iO23);
                    jVar2.f34345q = cursorG.getInt(iO24) != 0;
                    jVar2.f34346r = com.google.android.gms.internal.auth.m.l(cursorG.getInt(iO25));
                    jVar2.f34338j = cVar;
                } else {
                    jVar2 = null;
                }
                cursorG.close();
                jVar.k();
                return jVar2;
            } catch (Throwable th2) {
                th = th2;
                cursorG.close();
                jVar.k();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            jVar = jVarD;
        }
    }

    public void i(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13337a;
        workDatabase_Impl.b();
        u7.e eVar = (u7.e) this.f13342f;
        r6.f fVarA = eVar.a();
        if (str == null) {
            fVarA.d(1);
        } else {
            fVarA.h(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.f32265e.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public void j(y8.j jVar, int i) {
        byte[] bArr;
        long j10;
        z8.a aVar;
        String str;
        z8.a aVar2;
        int i10;
        a4.g gVarD;
        String str2;
        Integer numValueOf;
        m.h3 h3Var;
        final c cVar = this;
        final y8.j jVar2 = jVar;
        byte[] bArr2 = jVar2.f36553b;
        g9.c cVar2 = (g9.c) cVar.f13342f;
        z8.e eVarA = ((z8.d) cVar.f13338b).a(jVar2.f36552a);
        long jMax = 0;
        while (true) {
            final int i11 = 0;
            f9.j jVar3 = (f9.j) cVar2;
            if (!((Boolean) jVar3.j(new g9.b(cVar) { // from class: e9.e

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ com.google.android.gms.internal.consent_sdk.c f16309c;

                {
                    this.f16309c = cVar;
                }

                @Override // g9.b
                public final Object execute() {
                    Boolean bool;
                    switch (i11) {
                        case 0:
                            j jVar4 = jVar2;
                            f9.j jVar5 = (f9.j) ((f9.d) this.f16309c.f13339c);
                            SQLiteDatabase sQLiteDatabaseA = jVar5.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lB = f9.j.b(sQLiteDatabaseA, jVar4);
                                if (lB == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = jVar5.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lB.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th2) {
                                        cursorRawQuery.close();
                                        throw th2;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                return bool;
                            } finally {
                                sQLiteDatabaseA.endTransaction();
                            }
                        default:
                            f9.j jVar6 = (f9.j) ((f9.d) this.f16309c.f13339c);
                            jVar6.getClass();
                            return (Iterable) jVar6.d(new y(10, jVar6, jVar2));
                    }
                }
            })).booleanValue()) {
                jVar3.j(new e9.g(cVar, jVar2, jMax, 0));
                return;
            }
            final int i12 = 1;
            Iterable iterable = (Iterable) jVar3.j(new g9.b(cVar) { // from class: e9.e

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ com.google.android.gms.internal.consent_sdk.c f16309c;

                {
                    this.f16309c = cVar;
                }

                @Override // g9.b
                public final Object execute() {
                    Boolean bool;
                    switch (i12) {
                        case 0:
                            j jVar4 = jVar2;
                            f9.j jVar5 = (f9.j) ((f9.d) this.f16309c.f13339c);
                            SQLiteDatabase sQLiteDatabaseA = jVar5.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lB = f9.j.b(sQLiteDatabaseA, jVar4);
                                if (lB == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = jVar5.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lB.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th2) {
                                        cursorRawQuery.close();
                                        throw th2;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                return bool;
                            } finally {
                                sQLiteDatabaseA.endTransaction();
                            }
                        default:
                            f9.j jVar6 = (f9.j) ((f9.d) this.f16309c.f13339c);
                            jVar6.getClass();
                            return (Iterable) jVar6.d(new y(10, jVar6, jVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (eVarA == null) {
                ya.e.f("Uploader", "Unknown backend for %s, deleting event batch for it...", jVar2);
                aVar2 = new z8.a(3, -1L);
                bArr = bArr2;
                j10 = jMax;
            } else {
                ArrayList<y8.i> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((f9.b) it.next()).f16704c);
                }
                if (bArr2 != null) {
                    f9.c cVar3 = (f9.c) cVar.i;
                    Objects.requireNonNull(cVar3);
                    b9.a aVar3 = (b9.a) jVar3.j(new a0.a0(14, cVar3));
                    q9.o oVar = new q9.o();
                    oVar.f31951f = new HashMap();
                    oVar.f31949d = Long.valueOf(((h9.a) cVar.f13343g).b());
                    oVar.f31950e = Long.valueOf(((h9.a) cVar.f13344h).b());
                    oVar.f31946a = "GDT_CLIENT_METRICS";
                    v8.c cVar4 = new v8.c("proto");
                    aVar3.getClass();
                    bb.e eVar = y8.o.f36564a;
                    eVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        eVar.n(byteArrayOutputStream, aVar3);
                    } catch (IOException unused) {
                    }
                    oVar.f31948c = new y8.m(cVar4, byteArrayOutputStream.toByteArray());
                    arrayList.add(((w8.b) eVarA).a(oVar.i()));
                }
                w8.b bVar = (w8.b) eVarA;
                HashMap map = new HashMap();
                for (y8.i iVar : arrayList) {
                    String str3 = iVar.f36546a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(iVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(iVar);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    y8.i iVar2 = (y8.i) ((List) entry.getValue()).get(0);
                    x8.w wVar = x8.w.f36051b;
                    long jB = bVar.f35212f.b();
                    long jB2 = bVar.f35211e.b();
                    x8.j jVar4 = new x8.j(new x8.h(Integer.valueOf(iVar2.b("sdk-version")), iVar2.a("model"), iVar2.a("hardware"), iVar2.a(Device.TYPE), iVar2.a("product"), iVar2.a("os-uild"), iVar2.a("manufacturer"), iVar2.a(SentryEvent.JsonKeys.FINGERPRINT), iVar2.a("locale"), iVar2.a(AdRevenueScheme.COUNTRY), iVar2.a("mcc_mnc"), iVar2.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (y8.i iVar3 : (List) entry.getValue()) {
                        Iterator it3 = it2;
                        y8.m mVar = iVar3.f36548c;
                        byte[] bArr3 = bArr2;
                        v8.c cVar5 = mVar.f36561a;
                        byte[] bArr4 = mVar.f36562b;
                        long j11 = jMax;
                        if (cVar5.equals(new v8.c("proto"))) {
                            h3Var = new m.h3();
                            h3Var.f28253e = bArr4;
                        } else if (cVar5.equals(new v8.c("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            m.h3 h3Var2 = new m.h3();
                            h3Var2.f28254f = str4;
                            h3Var = h3Var2;
                        } else {
                            String strM = ya.e.m("CctTransportBackend");
                            if (Log.isLoggable(strM, 5)) {
                                Log.w(strM, "Received event of unsupported encoding " + cVar5 + ". Skipping...");
                            }
                            it2 = it3;
                            bArr2 = bArr3;
                            jMax = j11;
                        }
                        h3Var.f28250b = Long.valueOf(iVar3.f36549d);
                        h3Var.f28252d = Long.valueOf(iVar3.f36550e);
                        String str5 = (String) iVar3.f36551f.get("tz-offset");
                        h3Var.f28255g = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        h3Var.f28256h = new x8.n((x8.u) x8.u.f36049b.get(iVar3.b("net-type")), (x8.t) x8.t.f36047b.get(iVar3.b("mobile-subtype")));
                        Integer num = iVar3.f36547b;
                        if (num != null) {
                            h3Var.f28251c = num;
                        }
                        String strX = ((Long) h3Var.f28250b) == null ? " eventTimeMs" : "";
                        if (((Long) h3Var.f28252d) == null) {
                            strX = strX.concat(" eventUptimeMs");
                        }
                        if (((Long) h3Var.f28255g) == null) {
                            strX = om1.x(strX, " timezoneOffsetSeconds");
                        }
                        if (!strX.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strX));
                        }
                        arrayList4.add(new x8.k(((Long) h3Var.f28250b).longValue(), (Integer) h3Var.f28251c, ((Long) h3Var.f28252d).longValue(), (byte[]) h3Var.f28253e, (String) h3Var.f28254f, ((Long) h3Var.f28255g).longValue(), (x8.n) h3Var.f28256h));
                        it2 = it3;
                        bArr2 = bArr3;
                        jMax = j11;
                    }
                    arrayList3.add(new x8.l(jB, jB2, jVar4, numValueOf, str2, arrayList4));
                    it2 = it2;
                }
                bArr = bArr2;
                j10 = jMax;
                x8.i iVar4 = new x8.i(arrayList3);
                URL urlB = bVar.f35210d;
                if (bArr != null) {
                    try {
                        w8.a aVarA = w8.a.a(bArr);
                        str = aVarA.f35206b;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = aVarA.f35205a;
                        if (str6 != null) {
                            urlB = w8.b.b(str6);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new z8.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    int i13 = 27;
                    bb.e eVar2 = new bb.e(urlB, iVar4, str, i13);
                    s3.q qVar = new s3.q(19, bVar);
                    int i14 = 5;
                    do {
                        gVarD = qVar.d(eVar2);
                        URL url = (URL) gVarD.f432e;
                        if (url != null) {
                            ya.e.f("CctTransportBackend", "Following redirect to: %s", url);
                            eVar2 = new bb.e(url, (x8.i) eVar2.f2020d, (String) eVar2.f2021e, i13);
                        } else {
                            eVar2 = null;
                        }
                        if (eVar2 == null) {
                            break;
                        } else {
                            i14--;
                        }
                    } while (i14 >= 1);
                    int i15 = gVarD.f431d;
                    if (i15 == 200) {
                        aVar2 = new z8.a(1, gVarD.f430c);
                    } else {
                        if (i15 >= 500 || i15 == 404) {
                            aVar = new z8.a(2, -1L);
                        } else if (i15 == 400) {
                            try {
                                aVar = new z8.a(4, -1L);
                            } catch (IOException e3) {
                                e = e3;
                                ya.e.g("CctTransportBackend", "Could not make request to the backend", e);
                                i10 = 2;
                                aVar2 = new z8.a(2, -1L);
                            }
                        } else {
                            aVar = new z8.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e7) {
                    e = e7;
                }
            }
            i10 = 2;
            int i16 = aVar2.f46202a;
            if (i16 == i10) {
                jVar3.j(new e9.f(this, iterable, jVar, j10));
                ((ka.k) this.f13340d).R(jVar, i + 1, true);
                return;
            }
            cVar = this;
            jVar2 = jVar;
            jMax = j10;
            jVar3.j(new a0.y(7, cVar, iterable));
            if (i16 == 1) {
                jMax = Math.max(jMax, aVar2.f46203b);
                if (bArr != null) {
                    jVar3.j(new a0.a0(16, cVar));
                }
            } else if (i16 == 4) {
                HashMap map2 = new HashMap();
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    String str7 = ((f9.b) it4.next()).f16704c.f36546a;
                    if (map2.containsKey(str7)) {
                        map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                    } else {
                        map2.put(str7, 1);
                    }
                }
                jVar3.j(new a0.y(8, cVar, map2));
            }
            bArr2 = bArr;
        }
    }

    public void k(long j10, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13337a;
        workDatabase_Impl.b();
        u7.e eVar = (u7.e) this.f13344h;
        r6.f fVarA = eVar.a();
        fVarA.b(1, j10);
        if (str == null) {
            fVarA.d(2);
        } else {
            fVarA.h(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.f32265e.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public void l(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13337a;
        workDatabase_Impl.b();
        u7.e eVar = (u7.e) this.f13343g;
        r6.f fVarA = eVar.a();
        if (str == null) {
            fVarA.d(1);
        } else {
            fVarA.h(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.f32265e.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public void m(String str, l7.f fVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13337a;
        workDatabase_Impl.b();
        u7.e eVar = (u7.e) this.f13340d;
        r6.f fVarA = eVar.a();
        byte[] bArrC = l7.f.c(fVar);
        if (bArrC == null) {
            fVarA.d(1);
        } else {
            fVarA.a(1, bArrC);
        }
        if (str == null) {
            fVarA.d(2);
        } else {
            fVarA.h(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.k();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public void n(long j10, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13337a;
        workDatabase_Impl.b();
        u7.e eVar = (u7.e) this.f13341e;
        r6.f fVarA = eVar.a();
        fVarA.b(1, j10);
        if (str == null) {
            fVarA.d(2);
        } else {
            fVarA.h(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.k();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public void o(int i, String... strArr) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13337a;
        workDatabase_Impl.b();
        StringBuilder sb2 = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append("?");
            if (i10 < length - 1) {
                sb2.append(StringUtils.COMMA);
            }
        }
        sb2.append(")");
        String string = sb2.toString();
        workDatabase_Impl.a();
        workDatabase_Impl.b();
        SQLiteStatement sQLiteStatementCompileStatement = ((SQLiteDatabase) workDatabase_Impl.f27969c.getWritableDatabase().f32252c).compileStatement(string);
        sQLiteStatementCompileStatement.bindLong(1, com.google.android.gms.internal.auth.m.A(i));
        int i11 = 2;
        for (String str : strArr) {
            if (str == null) {
                sQLiteStatementCompileStatement.bindNull(i11);
            } else {
                sQLiteStatementCompileStatement.bindString(i11, str);
            }
            i11++;
        }
        workDatabase_Impl.c();
        try {
            sQLiteStatementCompileStatement.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public x10 p() {
        gr.L((Context) this.f13339c, Context.class);
        gr.L((HashMap) this.f13343g, Map.class);
        gr.L((jd) this.f13344h, jd.class);
        gr.L((by0) this.i, by0.class);
        return new x10((f80) this.f13337a, (cw) this.f13338b, (Context) this.f13339c, (View) this.f13340d, (Activity) this.f13341e, (String) this.f13342f, (HashMap) this.f13343g, (jd) this.f13344h, (by0) this.i);
    }

    public qv1 q(ov1 ov1Var) {
        kv1 kv1VarC;
        int i;
        boolean zBooleanValue;
        int iB;
        y(ov1Var);
        hw1 hw1Var = (hw1) this.i;
        jx1 jx1Var = (jx1) ov1Var.f8815a;
        s50 s50Var = (s50) ov1Var.f8816b;
        hw1Var.getClass();
        jx1Var.getClass();
        String str = jx1Var.f6975m;
        s50Var.getClass();
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 2;
        if (i10 < 29 || (i = jx1Var.F) == -1) {
            kv1VarC = kv1.f7317d;
        } else {
            Context context = (Context) hw1Var.f6277b;
            Boolean bool = (Boolean) hw1Var.f6278c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                if (context != null) {
                    String parameters = nz.c(context).getParameters("offloadVariableRateSupported");
                    hw1Var.f6278c = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                } else {
                    hw1Var.f6278c = Boolean.FALSE;
                }
                zBooleanValue = ((Boolean) hw1Var.f6278c).booleanValue();
            }
            str.getClass();
            int iG = ra.g(str, jx1Var.f6972j);
            if (iG == 0 || i10 < cq0.c(iG) || (iB = cq0.b(jx1Var.E)) == 0) {
                kv1VarC = kv1.f7317d;
            } else {
                try {
                    AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iB).setEncoding(iG).build();
                    if (i10 >= 31) {
                        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, s50Var.a());
                        if (playbackOffloadSupport == 0) {
                            kv1VarC = kv1.f7317d;
                        } else {
                            com.google.android.gms.internal.ads.p5 p5Var = new com.google.android.gms.internal.ads.p5();
                            boolean z5 = i10 > 32 && playbackOffloadSupport == 2;
                            p5Var.f8926a = true;
                            p5Var.f8927b = z5;
                            p5Var.f8928c = zBooleanValue;
                            kv1VarC = p5Var.c();
                        }
                    } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, s50Var.a())) {
                        com.google.android.gms.internal.ads.p5 p5Var2 = new com.google.android.gms.internal.ads.p5();
                        p5Var2.f8926a = true;
                        p5Var2.f8928c = zBooleanValue;
                        kv1VarC = p5Var2.c();
                    } else {
                        kv1VarC = kv1.f7317d;
                    }
                } catch (IllegalArgumentException unused) {
                    kv1VarC = kv1.f7317d;
                }
            }
        }
        pv1 pv1Var = new pv1();
        if (Objects.equals(str, "audio/raw")) {
            int i12 = jx1Var.G;
            if (!cq0.a(i12)) {
                a0.u.t(new StringBuilder(String.valueOf(i12).length() + 22), "Invalid PCM encoding: ", i12, "ATAudioOutputProvider");
                i11 = 0;
            } else if (i12 != 2) {
                i11 = 1;
            }
        } else if (((hv1) this.f13341e).c(jx1Var, s50Var) == null) {
            i11 = 0;
        }
        pv1Var.f9192a = i11;
        pv1Var.f9193b = kv1VarC.f7318a;
        pv1Var.f9194c = kv1VarC.f7319b;
        pv1Var.f9195d = kv1VarC.f7320c;
        return pv1Var.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.sv1 s(com.google.android.gms.internal.ads.ov1 r22) throws com.google.android.gms.internal.ads.nv1 {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.c.s(com.google.android.gms.internal.ads.ov1):com.google.android.gms.internal.ads.sv1");
    }

    public LinkedHashMap t(LinkedHashMap linkedHashMap, Map map) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap2.get(str);
            bl blVar = (bl) ((HashMap) this.f13339c).get(str);
            if (blVar == null) {
                blVar = bl.f3808b;
            }
            linkedHashMap2.put(str, blVar.a(str3, str2));
        }
        return linkedHashMap2;
    }

    public y u(c cVar) throws n1 {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent((Application) this.f13337a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = (String) cVar.f13337a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    ad.m0 m0Var = (ad.m0) cVar.f13338b;
                    if (m0Var != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = m0Var.f839c;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i10 = i - 1;
                            if (i10 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i10 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = (String) m0Var.f840d;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = (Integer) m0Var.f841e;
                        if (num != null) {
                            jsonWriter.name(ProfilingTraceData.JsonKeys.ANDROID_API_LEVEL);
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = (String) cVar.f13339c;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = (Boolean) cVar.f13340d;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = (Map) cVar.f13341e;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    com.google.firebase.messaging.y yVar = (com.google.firebase.messaging.y) cVar.f13342f;
                    if (yVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = (Integer) yVar.f14899b;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = (Integer) yVar.f14900c;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d10 = (Double) yVar.f14901d;
                        if (d10 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d10);
                        }
                        List<w> list = (List) yVar.f14902e;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (w wVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = wVar.f13599a;
                                if (num4 != null) {
                                    jsonWriter.name(RRWebVideoEvent.JsonKeys.TOP);
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = wVar.f13600b;
                                if (num5 != null) {
                                    jsonWriter.name(RRWebVideoEvent.JsonKeys.LEFT);
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = wVar.f13601c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = wVar.f13602d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    u uVar = (u) cVar.f13343g;
                    if (uVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = uVar.f13555a;
                        if (str4 != null) {
                            jsonWriter.name(SentryLockReason.JsonKeys.PACKAGE_NAME);
                            jsonWriter.value(str4);
                        }
                        String str5 = uVar.f13556b;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = uVar.f13557c;
                        if (str6 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    if (((m4) cVar.f13344h) != null) {
                        jsonWriter.name(DebugMeta.JsonKeys.SDK_INFO);
                        jsonWriter.beginObject();
                        jsonWriter.name("version");
                        jsonWriter.value("4.0.0");
                        jsonWriter.endObject();
                    }
                    List list2 = (List) cVar.i;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((v) it.next()).ordinal()) {
                                case 0:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case 1:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case 2:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case 3:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case 4:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case 5:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case 6:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                                case 7:
                                    jsonWriter.value("GEO_OVERRIDE_USFL");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        y yVarA = y.a(new JsonReader(new StringReader(headerField)));
                        yVarA.f13608a = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return yVarA;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            y yVarA2 = y.a(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return yVarA2;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } finally {
                }
            } catch (Throwable th4) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (SocketTimeoutException e3) {
            throw new n1("The server timed out.", e3, 4);
        } catch (IOException e7) {
            throw new n1("Error making request.", e7, 2);
        }
    }

    public void v(xp0 xp0Var) {
        ed.d dVarY;
        synchronized (this) {
            Iterator it = xp0Var.f12227a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVarY = vv.y(new uf0(3));
                    break;
                }
                zh0 zh0VarA = ((t40) this.f13339c).a(xp0Var.f12229b, (String) it.next());
                if (zh0VarA != null && zh0VarA.a((eq0) this.i, xp0Var)) {
                    dVarY = vv.I(zh0VarA.b((eq0) this.i, xp0Var), xp0Var.R, TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f13338b);
                    break;
                }
            }
        }
        ((oj0) this.f13340d).b((eq0) this.i, xp0Var, dVarY, (at0) this.f13341e);
        dVarY.a(new l81(0 == true ? 1 : 0, dVarY, new n90(14, this, xp0Var, false)), (Executor) this.f13337a);
    }

    public ew1 w(sv1 sv1Var) throws rv1 {
        Context context;
        try {
            int i = sv1Var.f10414f;
            int i10 = sv1Var.f10415g;
            Context context2 = null;
            if (i10 != -1 && (context = (Context) this.f13337a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = (Context) this.f13344h;
                if (context3 == null || context3.getDeviceId() != i10) {
                    this.f13344h = context.createDeviceContext(i10);
                }
                context2 = (Context) this.f13344h;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(sv1Var.f10413e.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(sv1Var.f10410b).setChannelMask(sv1Var.f10411c).setEncoding(sv1Var.f10409a).build()).setTransferMode(1).setBufferSizeInBytes(sv1Var.f10412d).setSessionId(i);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (i11 >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new ew1(audioTrackBuild, sv1Var, (xo0) this.f13338b, (com.google.android.gms.internal.ads.c6) this.f13340d);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new rv1();
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new rv1(e);
        } catch (UnsupportedOperationException e7) {
            e = e7;
            throw new rv1(e);
        }
    }

    public void x(LinkedHashMap linkedHashMap, dl dlVar) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse((String) this.f13340d).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (dlVar != null) {
            String str = dlVar.f4598c;
            String str2 = dlVar.f4597b;
            StringBuilder sb2 = new StringBuilder(string);
            if (!TextUtils.isEmpty(str2)) {
                sb2.append("&it=");
                sb2.append(str2);
            }
            if (!TextUtils.isEmpty(str)) {
                sb2.append("&blat=");
                sb2.append(str);
            }
            string = sb2.toString();
        }
        FileOutputStream fileOutputStream = null;
        if (!((AtomicBoolean) this.f13344h).get()) {
            t9.g0 g0Var = p9.k.C.f31297c;
            new t9.x((Context) this.f13341e, (String) this.f13342f, string, null).B();
            return;
        }
        File file = (File) this.i;
        try {
            if (file == null) {
                u9.i.h("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
                return;
            }
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                        return;
                    } catch (IOException e3) {
                        u9.i.i("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                        return;
                    }
                } catch (IOException e7) {
                    e = e7;
                    fileOutputStream = fileOutputStream2;
                    u9.i.i("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            return;
                        } catch (IOException e10) {
                            u9.i.i("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e12) {
                u9.i.i("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
            }
        }
        throw th;
    }

    public void y(ov1 ov1Var) {
        Context context;
        hv1 hv1VarB;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) ov1Var.f8817c;
        s50 s50Var = (s50) ov1Var.f8816b;
        z();
        yi0 yi0Var = (yi0) this.f13342f;
        if (yi0Var == null && (context = (Context) this.f13337a) != null) {
            yi0 yi0Var2 = new yi0(context, new in0(18, this), s50Var, audioDeviceInfo);
            this.f13342f = yi0Var2;
            if (yi0Var2.f12622b) {
                hv1VarB = (hv1) yi0Var2.i;
                hv1VarB.getClass();
            } else {
                yi0Var2.f12622b = true;
                jv1 jv1Var = (jv1) yi0Var2.f12628h;
                if (jv1Var != null) {
                    jv1Var.f6945b.registerContentObserver(jv1Var.f6946c, false, jv1Var);
                }
                Context context2 = (Context) yi0Var2.f12623c;
                iv1 iv1Var = (iv1) yi0Var2.f12626f;
                Handler handler = (Handler) yi0Var2.f12625e;
                nz.c(context2).registerAudioDeviceCallback(iv1Var, handler);
                hv1VarB = hv1.b(context2, context2.registerReceiver((bj.g) yi0Var2.f12627g, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (s50) yi0Var2.f12630k, (AudioDeviceInfo) yi0Var2.f12629j);
                yi0Var2.i = hv1VarB;
            }
            this.f13341e = hv1VarB;
        } else if (yi0Var != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) yi0Var.f12629j)) {
                yi0Var.f12629j = audioDeviceInfo;
                yi0Var.h(hv1.a((Context) yi0Var.f12623c, (s50) yi0Var.f12630k, audioDeviceInfo));
            }
            yi0 yi0Var3 = (yi0) this.f13342f;
            if (!Objects.equals(s50Var, (s50) yi0Var3.f12630k)) {
                yi0Var3.f12630k = s50Var;
                yi0Var3.h(hv1.a((Context) yi0Var3.f12623c, s50Var, (AudioDeviceInfo) yi0Var3.f12629j));
            }
        }
        ((hv1) this.f13341e).getClass();
    }

    public void z() {
        if (((Context) this.f13337a) == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = (Looper) this.f13343g;
        boolean z5 = true;
        if (looper != null && looper != looperMyLooper) {
            z5 = false;
        }
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (!z5) {
            throw new IllegalStateException(gr.P("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
        this.f13343g = looperMyLooper;
    }

    public /* synthetic */ c(Context context, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.f13337a = context;
        this.f13338b = obj;
        this.f13339c = obj2;
        this.f13340d = obj3;
        this.f13341e = obj4;
        this.f13342f = obj5;
        this.f13343g = obj6;
        this.f13344h = obj7;
        this.i = obj8;
    }

    public c() {
        this.f13337a = new ArrayBlockingQueue(100);
        this.f13338b = new LinkedHashMap();
        this.f13339c = new HashMap();
        this.f13343g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
    }

    public c(ot1 ot1Var, ht1 ht1Var, com.google.android.gms.internal.ads.c6 c6Var, int i, int i10, int i11, int i12) {
        this.f13337a = ot1Var;
        this.f13339c = ht1Var;
        this.f13340d = new bh();
        this.f13341e = c6Var.y(ot1Var.f8793u, new of0(1, this));
        this.f13342f = new em0(i, this);
        this.f13343g = new om0(i10, this);
        this.f13344h = new rm0(i11, this);
        this.i = new ym0(i12, this);
        ll0 ll0Var = new ll0(this);
        this.f13338b = ll0Var;
        ot1Var.f8787o.g(ll0Var);
    }

    public c(WorkDatabase_Impl workDatabase_Impl) {
        this.f13337a = workDatabase_Impl;
        this.f13338b = new u7.b(workDatabase_Impl, 5);
        this.f13339c = new u7.e(workDatabase_Impl, 3);
        this.f13340d = new u7.e(workDatabase_Impl, 4);
        this.f13341e = new u7.e(workDatabase_Impl, 5);
        this.f13342f = new u7.e(workDatabase_Impl, 6);
        this.f13343g = new u7.e(workDatabase_Impl, 7);
        this.f13344h = new u7.e(workDatabase_Impl, 8);
        this.i = new u7.e(workDatabase_Impl, 9);
        new AtomicBoolean(false);
    }
}
