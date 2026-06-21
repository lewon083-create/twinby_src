package zd;

import android.net.TrafficStats;
import android.util.Log;
import com.google.android.gms.internal.measurement.b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import md.m;
import org.json.JSONException;
import org.json.JSONObject;
import pa.c0;
import t.z;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f46249m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd.g f46250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final be.c f46251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1.e f46252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f46253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f46254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f46255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f46256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f46257h;
    public final nd.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f46258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f46259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f46260l;

    static {
        new AtomicInteger(1);
    }

    public c(fd.g gVar, yd.a aVar, ExecutorService executorService, nd.j jVar) {
        gVar.a();
        be.c cVar = new be.c(gVar.f16758a, aVar);
        a1.e eVar = new a1.e(gVar);
        if (g8.g.f20032d == null) {
            g8.g.f20032d = new g8.g(10);
        }
        g8.g gVar2 = g8.g.f20032d;
        if (j.f46268d == null) {
            j.f46268d = new j(gVar2);
        }
        j jVar2 = j.f46268d;
        m mVar = new m(new md.d(2, gVar));
        h hVar = new h();
        this.f46256g = new Object();
        this.f46259k = new HashSet();
        this.f46260l = new ArrayList();
        this.f46250a = gVar;
        this.f46251b = cVar;
        this.f46252c = eVar;
        this.f46253d = jVar2;
        this.f46254e = mVar;
        this.f46255f = hVar;
        this.f46257h = executorService;
        this.i = jVar;
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        ae.b bVarT;
        synchronized (f46249m) {
            try {
                fd.g gVar = this.f46250a;
                gVar.a();
                v vVarH = v.h(gVar.f16758a);
                try {
                    bVarT = this.f46252c.T();
                    int i = bVarT.f912b;
                    boolean z5 = true;
                    if (i != 2 && i != 1) {
                        z5 = false;
                    }
                    if (z5) {
                        String strF = f(bVarT);
                        a1.e eVar = this.f46252c;
                        ae.a aVarA = bVarT.a();
                        aVarA.f902a = strF;
                        aVarA.f903b = 3;
                        bVarT = aVarA.a();
                        eVar.M(bVarT);
                    }
                    if (vVarH != null) {
                        vVarH.y();
                    }
                } catch (Throwable th2) {
                    if (vVarH != null) {
                        vVarH.y();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        i(bVarT);
        this.i.execute(new b(this, 1));
    }

    public final ae.b b(ae.b bVar) throws e {
        int i;
        int responseCode;
        be.b bVar2;
        be.b bVarF;
        be.c cVar = this.f46251b;
        fd.g gVar = this.f46250a;
        gVar.a();
        String str = gVar.f16760c.f16772a;
        String str2 = bVar.f911a;
        fd.g gVar2 = this.f46250a;
        gVar2.a();
        String str3 = gVar2.f16760c.f16778g;
        String str4 = bVar.f914d;
        be.d dVar = cVar.f2084c;
        if (!dVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = be.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i10 = 0; i10 <= 1; i10 = i + 1) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    be.c.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    dVar.b(responseCode);
                } catch (IOException | AssertionError unused) {
                    i = i10;
                }
                if (responseCode >= 200 && responseCode < 300) {
                    bVarF = be.c.f(httpURLConnectionC);
                } else {
                    be.c.b(httpURLConnectionC, null, str, str3);
                    i = i10;
                    if (responseCode == 401 || responseCode == 404) {
                        if (((byte) (0 | 1)) != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        bVar2 = new be.b(null, 0L, 3);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        bVarF = bVar2;
                    } else {
                        if (responseCode == 429) {
                            throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            bVar2 = new be.b(null, 0L, 2);
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            bVarF = bVar2;
                        }
                    }
                }
                int iM = z.m(bVarF.f2079c);
                if (iM != 0) {
                    if (iM == 1) {
                        ae.a aVarA = bVar.a();
                        aVarA.f908g = "BAD CONFIG";
                        aVarA.f903b = 5;
                        return aVarA.a();
                    }
                    if (iM != 2) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    synchronized (this) {
                        this.f46258j = null;
                    }
                    ae.a aVarA2 = bVar.a();
                    aVarA2.f903b = 2;
                    return aVarA2.a();
                }
                String str5 = bVarF.f2077a;
                long j10 = bVarF.f2078b;
                j jVar = this.f46253d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f46269a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                ae.a aVarA3 = bVar.a();
                aVarA3.f904c = str5;
                aVarA3.f906e = j10;
                byte b2 = (byte) (aVarA3.f909h | 1);
                aVarA3.f907f = seconds;
                aVarA3.f909h = (byte) (b2 | 2);
                return aVarA3.a();
            } finally {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final sb.m c() {
        String str;
        e();
        synchronized (this) {
            str = this.f46258j;
        }
        if (str != null) {
            return b4.s(str);
        }
        sb.g gVar = new sb.g();
        g gVar2 = new g(gVar);
        synchronized (this.f46256g) {
            this.f46260l.add(gVar2);
        }
        sb.m mVar = gVar.f32858a;
        this.f46257h.execute(new b(this, 0));
        return mVar;
    }

    public final sb.m d() {
        e();
        sb.g gVar = new sb.g();
        f fVar = new f(this.f46253d, gVar);
        synchronized (this.f46256g) {
            this.f46260l.add(fVar);
        }
        sb.m mVar = gVar.f32858a;
        this.f46257h.execute(new b(this, 2));
        return mVar;
    }

    public final void e() {
        fd.g gVar = this.f46250a;
        gVar.a();
        c0.g(gVar.f16760c.f16773b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        c0.g(gVar.f16760c.f16778g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        c0.g(gVar.f16760c.f16772a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f16760c.f16773b;
        Pattern pattern = j.f46267c;
        c0.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER));
        gVar.a();
        c0.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f46267c.matcher(gVar.f16760c.f16772a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(ae.b r6) {
        /*
            r5 = this;
            fd.g r0 = r5.f46250a
            r0.a()
            java.lang.String r0 = r0.f16759b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            fd.g r0 = r5.f46250a
            java.lang.String r1 = "[DEFAULT]"
            r0.a()
            java.lang.String r0 = r0.f16759b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5c
        L1e:
            int r6 = r6.f912b
            r0 = 1
            if (r6 != r0) goto L5c
            md.m r6 = r5.f46254e
            java.lang.Object r6 = r6.get()
            ae.c r6 = (ae.c) r6
            android.content.SharedPreferences r0 = r6.f919a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f919a     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences r2 = r6.f919a     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r6 = move-exception
            goto L5a
        L41:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
        L46:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L56
            zd.h r6 = r5.f46255f
            r6.getClass()
            java.lang.String r6 = zd.h.a()
            return r6
        L56:
            return r2
        L57:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            throw r6     // Catch: java.lang.Throwable -> L3f
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r6
        L5c:
            zd.h r6 = r5.f46255f
            r6.getClass()
            java.lang.String r6 = zd.h.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.c.f(ae.b):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [be.c] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [be.a] */
    public final ae.b g(ae.b bVar) throws e {
        int responseCode;
        String str = bVar.f911a;
        String string = null;
        if (str != null && str.length() == 11) {
            ae.c cVar = (ae.c) this.f46254e.get();
            synchronized (cVar.f919a) {
                try {
                    String[] strArr = ae.c.f918c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str2 = strArr[i];
                            String string2 = cVar.f919a.getString("|T|" + cVar.f920b + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        be.c cVar2 = this.f46251b;
        fd.g gVar = this.f46250a;
        gVar.a();
        String str3 = gVar.f16760c.f16772a;
        String str4 = bVar.f911a;
        fd.g gVar2 = this.f46250a;
        gVar2.a();
        String str5 = gVar2.f16760c.f16778g;
        fd.g gVar3 = this.f46250a;
        gVar3.a();
        String str6 = gVar3.f16760c.f16773b;
        be.d dVar = cVar2.f2084c;
        if (!dVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = be.c.a("projects/" + str5 + "/installations");
        int i10 = 0;
        be.a aVar = cVar2;
        while (i10 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = aVar.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    be.c.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    dVar.b(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                be.a aVarE = be.c.e(httpURLConnectionC);
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                aVar = aVarE;
            } else {
                try {
                    be.c.b(httpURLConnectionC, str6, str3, str5);
                } catch (IOException | AssertionError unused3) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                if (responseCode == 429) {
                    throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    be.a aVar2 = new be.a(null, null, null, null, 2);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar = aVar2;
                } else {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i10++;
                    aVar = aVar;
                }
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                i10++;
                aVar = aVar;
            }
            int iM = z.m(aVar.f2076e);
            if (iM != 0) {
                if (iM != 1) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                ae.a aVarA = bVar.a();
                aVarA.f908g = "BAD CONFIG";
                aVarA.f903b = 5;
                return aVarA.a();
            }
            String str7 = aVar.f2073b;
            String str8 = aVar.f2074c;
            j jVar = this.f46253d;
            jVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jVar.f46269a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            be.b bVar2 = aVar.f2075d;
            String str9 = bVar2.f2077a;
            long j10 = bVar2.f2078b;
            ae.a aVarA2 = bVar.a();
            aVarA2.f902a = str7;
            aVarA2.f903b = 4;
            aVarA2.f904c = str9;
            aVarA2.f905d = str8;
            aVarA2.f906e = j10;
            byte b2 = (byte) (aVarA2.f909h | 1);
            aVarA2.f907f = seconds;
            aVarA2.f909h = (byte) (b2 | 2);
            return aVarA2.a();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f46256g) {
            try {
                Iterator it = this.f46260l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(ae.b bVar) {
        synchronized (this.f46256g) {
            try {
                Iterator it = this.f46260l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
