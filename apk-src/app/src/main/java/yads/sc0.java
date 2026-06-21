package yads;

import android.net.Uri;
import android.util.SparseArray;
import com.monetization.ads.exo.source.dash.offline.DashDownloader;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sc0 implements tj0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f42895c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qr f42896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f42897b;

    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, a(DashDownloader.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, a(Class.forName("com.monetization.ads.exo.source.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, a(Class.forName("com.monetization.ads.exo.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        f42895c = sparseArray;
    }

    public sc0(qr qrVar, ExecutorService executorService) {
        this.f42896a = (qr) ni.a(qrVar);
        this.f42897b = (Executor) ni.a(executorService);
    }

    public final sj0 a(qj0 qj0Var) {
        cm1 cm1Var;
        cm1 cm1Var2;
        int iA = lb3.a(qj0Var.f42317c, qj0Var.f42318d);
        if (iA != 0 && iA != 1 && iA != 2) {
            if (iA != 4) {
                throw new IllegalArgumentException(og2.a("Unsupported type: ", iA));
            }
            ul1 ul1Var = new ul1();
            xl1 xl1Var = new xl1();
            List list = Collections.EMPTY_LIST;
            um2 um2Var = um2.f43723f;
            em1 em1Var = em1.f38181d;
            Uri uri = qj0Var.f42317c;
            String str = qj0Var.f42321g;
            if (xl1Var.f44754b != null && xl1Var.f44753a == null) {
                throw new IllegalStateException();
            }
            if (uri != null) {
                cm1Var2 = new cm1(uri, null, xl1Var.f44753a != null ? new yl1(xl1Var) : null, list, str, um2Var, null);
            } else {
                cm1Var2 = null;
            }
            return new zj2(new hm1("", new wl1(ul1Var), cm1Var2, new am1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), lm1.H, em1Var), this.f42896a, this.f42897b);
        }
        Constructor constructor = (Constructor) f42895c.get(iA);
        if (constructor == null) {
            throw new IllegalStateException(og2.a("Module missing for content type ", iA));
        }
        ul1 ul1Var2 = new ul1();
        xl1 xl1Var2 = new xl1();
        um2 um2Var2 = um2.f43723f;
        em1 em1Var2 = em1.f38181d;
        Uri uri2 = qj0Var.f42317c;
        List list2 = qj0Var.f42319e;
        List listUnmodifiableList = (list2 == null || list2.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list2));
        String str2 = qj0Var.f42321g;
        if (xl1Var2.f44754b != null && xl1Var2.f44753a == null) {
            throw new IllegalStateException();
        }
        if (uri2 != null) {
            cm1Var = new cm1(uri2, null, xl1Var2.f44753a != null ? new yl1(xl1Var2) : null, listUnmodifiableList, str2, um2Var2, null);
        } else {
            cm1Var = null;
        }
        try {
            return (sj0) constructor.newInstance(new hm1("", new wl1(ul1Var2), cm1Var, new am1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), lm1.H, em1Var2), this.f42896a, this.f42897b);
        } catch (Exception unused) {
            throw new IllegalStateException(og2.a("Failed to instantiate downloader for content type ", iA));
        }
    }

    public static Constructor a(Class cls) {
        try {
            return cls.asSubclass(sj0.class).getConstructor(hm1.class, qr.class, Executor.class);
        } catch (NoSuchMethodException e3) {
            throw new IllegalStateException("Downloader constructor missing", e3);
        }
    }
}
