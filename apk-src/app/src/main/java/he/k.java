package he;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.ads.yi0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f20524s = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f20525t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f20526a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20528c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HttpURLConnection f20531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public yi0 f20532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScheduledExecutorService f20533h;
    public final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fd.g f20534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zd.d f20535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f20536l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f20537m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f20541q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20527b = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Random f20539o = new Random();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ua.a f20540p = ua.a.f34401a;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f20538n = "firebase";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20529d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20530e = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f20542r = new Object();

    public k(fd.g gVar, zd.d dVar, g gVar2, c cVar, Context context, LinkedHashSet linkedHashSet, m mVar, ScheduledExecutorService scheduledExecutorService) {
        this.f20526a = linkedHashSet;
        this.f20533h = scheduledExecutorService;
        this.f20528c = Math.max(8 - mVar.c().f20543a, 1);
        this.f20534j = gVar;
        this.i = gVar2;
        this.f20535k = dVar;
        this.f20536l = cVar;
        this.f20537m = context;
        this.f20541q = mVar;
    }

    public static boolean d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashSet r0 = r1.f20526a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f20527b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f20529d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f20530e     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = 0
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: he.k.a():boolean");
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f20531f;
        if (httpURLConnection != null && !this.f20530e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e3) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e3);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e7) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e7);
            }
        }
    }

    public final String c(String str) {
        fd.g gVar = this.f20534j;
        gVar.a();
        Matcher matcher = f20525t.matcher(gVar.f16760c.f16773b);
        return z.f("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j10) {
        try {
            if (a()) {
                int i = this.f20528c;
                if (i > 0) {
                    this.f20528c = i - 1;
                    this.f20533h.schedule(new ac.g(8, this), j10, TimeUnit.MILLISECONDS);
                } else if (!this.f20530e) {
                    g(new ge.f("Unable to connect to the server. Check your connection and try again."));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void g(ge.g gVar) {
        Iterator it = this.f20526a.iterator();
        while (it.hasNext()) {
            ((ge.b) it.next()).b(gVar);
        }
    }

    public final synchronized void h() {
        this.f20540p.getClass();
        e(Math.max(0L, this.f20541q.c().f20544b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: he.k.i(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    public final synchronized yi0 j(HttpURLConnection httpURLConnection) {
        return new yi0(httpURLConnection, this.i, this.f20536l, this.f20526a, new j(this), this.f20533h, this.f20541q);
    }

    public final void k(Date date) {
        m mVar = this.f20541q;
        int i = mVar.c().f20543a + 1;
        long millis = TimeUnit.MINUTES.toMillis(f20524s[(i < 8 ? i : 8) - 1]);
        mVar.e(i, new Date(date.getTime() + (millis / 2) + ((long) this.f20539o.nextInt((int) millis))));
    }
}
