package pe;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Parcel;
import io.sentry.ISentryLifecycleToken;
import j3.n;
import j3.o;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import q4.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ int A(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("surface")) {
            return 1;
        }
        if (str.equals("texture")) {
            return 2;
        }
        if (str.equals("image")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.RenderMode.".concat(str));
    }

    public static /* synthetic */ int B(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("opaque")) {
            return 1;
        }
        if (str.equals("transparent")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.TransparencyMode.".concat(str));
    }

    public static int a(int i, int i10) {
        return String.valueOf(i).length() + i10;
    }

    public static int b(int i, int i10, String str) {
        return str.length() + i + i10;
    }

    public static String c(char c8, String str, String str2) {
        return str + str2 + c8;
    }

    public static String d(long j10, String str) {
        return str + j10;
    }

    public static /* synthetic */ String e(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) " ");
            }
        }
        return sb2.toString();
    }

    public static String f(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String g(StringBuilder sb2, int i, String str, int i10, String str2) {
        sb2.append(str);
        sb2.append(i);
        sb2.append(str2);
        sb2.append(i10);
        return sb2.toString();
    }

    public static String h(StringBuilder sb2, long j10, String str) {
        sb2.append(j10);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder i(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static StringBuilder j(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder k(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static HashMap l(Class cls, ud.a aVar) {
        HashMap map = new HashMap();
        map.put(cls, aVar);
        return map;
    }

    public static Map m(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static xa.a n(Parcel parcel) {
        xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
        parcel.recycle();
        return aVarL1;
    }

    public static void o(int i, int i10, int i11, HashMap map, String str) {
        map.put(str, Integer.valueOf(Color.rgb(i, i10, i11)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void p(ISentryLifecycleToken iSentryLifecycleToken) throws Exception {
        boolean zIsTerminated;
        if (iSentryLifecycleToken instanceof AutoCloseable) {
            iSentryLifecycleToken.close();
            return;
        }
        if (!(iSentryLifecycleToken instanceof ExecutorService)) {
            if (iSentryLifecycleToken instanceof TypedArray) {
                ((TypedArray) iSentryLifecycleToken).recycle();
                return;
            } else if (iSentryLifecycleToken instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) iSentryLifecycleToken).release();
                return;
            } else {
                if (!(iSentryLifecycleToken instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) iSentryLifecycleToken).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) iSentryLifecycleToken;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z5 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z5) {
                    executorService.shutdownNow();
                    z5 = true;
                }
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
    }

    public static void q(n nVar, a0 a0Var) {
        a0Var.a(new o(nVar));
    }

    public static void r(Integer num, String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(num);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    public static void s(StringBuilder sb2, String str, long j10, String str2) {
        sb2.append(str);
        sb2.append(j10);
        sb2.append(str2);
    }

    public static boolean t(wl.b bVar, String str) {
        return bVar.d().o().equals(str);
    }

    public static /* synthetic */ String u(int i) {
        if (i == 1) {
            return "surface";
        }
        if (i == 2) {
            return "texture";
        }
        if (i == 3) {
            return "image";
        }
        throw null;
    }

    public static /* synthetic */ String v(int i) {
        if (i == 1) {
            return "opaque";
        }
        if (i == 2) {
            return "transparent";
        }
        throw null;
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "INITIALIZING";
            case 2:
                return "IDLING";
            case 3:
                return "DISABLED";
            case 4:
                return "ENABLED";
            case 5:
                return "ERROR_ENCODER";
            case 6:
                return "ERROR_SOURCE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "RELEASED" : "READY" : "PENDING_RELEASE" : "INITIALIZING" : "NOT_INITIALIZED";
    }

    public static /* synthetic */ String z(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "INACTIVE" : "ACTIVE_NON_STREAMING" : "ACTIVE_STREAMING";
    }
}
