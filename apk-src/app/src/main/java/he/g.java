package he;

import a0.y;
import android.text.format.DateUtils;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.m1;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final long i = TimeUnit.HOURS.toSeconds(12);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f20507j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zd.d f20508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yd.a f20509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f20510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f20511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f20512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConfigFetchHttpClient f20513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f20514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f20515h;

    public g(zd.d dVar, yd.a aVar, Executor executor, Random random, c cVar, ConfigFetchHttpClient configFetchHttpClient, m mVar, HashMap map) {
        this.f20508a = dVar;
        this.f20509b = aVar;
        this.f20510c = executor;
        this.f20511d = random;
        this.f20512e = cVar;
        this.f20513f = configFetchHttpClient;
        this.f20514g = mVar;
        this.f20515h = map;
    }

    public final f a(String str, String str2, Date date, HashMap map) throws ge.f, ge.h, ge.i {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.f20513f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f20513f;
            HashMap mapD = d();
            String string = this.f20514g.f20547a.getString("last_fetch_etag", null);
            jd.b bVar = (jd.b) this.f20509b.get();
            f fVarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapD, string, map, bVar != null ? (Long) ((m1) ((jd.c) bVar).f26619a.f45c).a(null, null, true).get("_fot") : null, date, this.f20514g.b());
            d dVar = fVarFetch.f20505b;
            if (dVar != null) {
                m mVar = this.f20514g;
                long j10 = dVar.f20500f;
                synchronized (mVar.f20548b) {
                    mVar.f20547a.edit().putLong("last_template_version", j10).apply();
                }
            }
            String str4 = fVarFetch.f20506c;
            if (str4 != null) {
                m mVar2 = this.f20514g;
                synchronized (mVar2.f20548b) {
                    mVar2.f20547a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f20514g.d(0, m.f20546g);
            return fVarFetch;
        } catch (ge.i e3) {
            int i10 = e3.f20133b;
            m mVar3 = this.f20514g;
            if (i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504) {
                int i11 = mVar3.a().f20543a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f20507j;
                long millis = timeUnit.toMillis(iArr[Math.min(i11, iArr.length) - 1]);
                mVar3.d(i11, new Date(date.getTime() + (millis / 2) + ((long) this.f20511d.nextInt((int) millis))));
            }
            l lVarA = mVar3.a();
            int i12 = e3.f20133b;
            if (lVarA.f20543a > 1 || i12 == 429) {
                lVarA.f20544b.getTime();
                throw new ge.h("Fetch was throttled.");
            }
            if (i12 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i12 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i12 == 429) {
                    throw new ge.f("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i12 != 500) {
                    switch (i12) {
                        case 502:
                        case 503:
                        case VKApiCodes.CODE_VK_PAY_NOT_ENOUGH_MONEY /* 504 */:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new ge.i(e3.f20133b, "Fetch failed: ".concat(str3), e3);
        }
    }

    public final Task b(Task task, long j10, HashMap map) {
        Task taskF;
        Date date = new Date(System.currentTimeMillis());
        boolean zIsSuccessful = task.isSuccessful();
        m mVar = this.f20514g;
        if (zIsSuccessful) {
            Date date2 = new Date(mVar.f20547a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(m.f20545f) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j10) + date2.getTime()))) {
                return b4.s(new f(2, null, null));
            }
        }
        Date date3 = mVar.a().f20544b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f20510c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            taskF = b4.q(new ge.h(str));
        } else {
            zd.c cVar = (zd.c) this.f20508a;
            sb.m mVarC = cVar.c();
            sb.m mVarD = cVar.d();
            taskF = b4.L(mVarC, mVarD).f(executor, new e8.d(this, mVarC, mVarD, date, map));
        }
        return taskF.f(executor, new y(14, this, date));
    }

    public final Task c(int i10) {
        HashMap map = new HashMap(this.f20515h);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i10);
        return this.f20512e.b().f(this.f20510c, new y(13, this, map));
    }

    public final HashMap d() {
        HashMap map = new HashMap();
        jd.b bVar = (jd.b) this.f20509b.get();
        if (bVar != null) {
            for (Map.Entry entry : ((m1) ((jd.c) bVar).f26619a.f45c).a(null, null, false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
