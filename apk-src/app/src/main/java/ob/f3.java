package ob;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import io.sentry.util.StringUtils;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 extends u3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f30112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0 f30113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0 f30114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0 f30115h;
    public final y0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0 f30116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0 f30117k;

    public f3(z3 z3Var) {
        super(z3Var);
        this.f30112e = new HashMap();
        z0 z0Var = ((l1) this.f15951b).f30264f;
        l1.h(z0Var);
        this.f30113f = new y0(z0Var, "last_delete_stale", 0L);
        z0 z0Var2 = ((l1) this.f15951b).f30264f;
        l1.h(z0Var2);
        this.f30114g = new y0(z0Var2, "last_delete_stale_batch", 0L);
        z0 z0Var3 = ((l1) this.f15951b).f30264f;
        l1.h(z0Var3);
        this.f30115h = new y0(z0Var3, "backoff", 0L);
        z0 z0Var4 = ((l1) this.f15951b).f30264f;
        l1.h(z0Var4);
        this.i = new y0(z0Var4, "last_upload", 0L);
        z0 z0Var5 = ((l1) this.f15951b).f30264f;
        l1.h(z0Var5);
        this.f30116j = new y0(z0Var5, "last_upload_attempt", 0L);
        z0 z0Var6 = ((l1) this.f15951b).f30264f;
        l1.h(z0Var6);
        this.f30117k = new y0(z0Var6, "midnight_offset", 0L);
    }

    public final Pair G(String str) throws Throwable {
        AdvertisingIdClient.Info advertisingIdInfo;
        e3 e3Var;
        C();
        l1 l1Var = (l1) this.f15951b;
        ua.a aVar = l1Var.f30269l;
        g gVar = l1Var.f30263e;
        aVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f30112e;
        e3 e3Var2 = (e3) map.get(str);
        if (e3Var2 != null && jElapsedRealtime < e3Var2.f30098c) {
            return new Pair(e3Var2.f30096a, Boolean.valueOf(e3Var2.f30097b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long J = gVar.J(str, d0.f29999b) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(l1Var.f30260b);
            } catch (PackageManager.NameNotFoundException unused) {
                if (e3Var2 != null && jElapsedRealtime < e3Var2.f30098c + gVar.J(str, d0.f30002c)) {
                    return new Pair(e3Var2.f30096a, Boolean.valueOf(e3Var2.f30097b));
                }
                advertisingIdInfo = null;
            }
        } catch (Exception e3) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30417n.g(e3, "Unable to get advertising id");
            e3Var = new e3("", J, false);
        }
        if (advertisingIdInfo == null) {
            return new Pair(StringUtils.PROPER_NIL_UUID, Boolean.FALSE);
        }
        String id2 = advertisingIdInfo.getId();
        e3Var = id2 != null ? new e3(id2, J, advertisingIdInfo.isLimitAdTrackingEnabled()) : new e3("", J, advertisingIdInfo.isLimitAdTrackingEnabled());
        map.put(str, e3Var);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(e3Var.f30096a, Boolean.valueOf(e3Var.f30097b));
    }

    public final String H(String str, boolean z5) {
        C();
        String str2 = z5 ? (String) G(str).first : StringUtils.PROPER_NIL_UUID;
        MessageDigest messageDigestT = e4.T();
        if (messageDigestT == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestT.digest(str2.getBytes())));
    }

    @Override // ob.u3
    public final void F() {
    }
}
