package com.google.android.gms.internal.ads;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class om1 {
    public static int A(int i, int i10, int i11) {
        return com.google.android.gms.internal.measurement.a5.M(i) + i10 + i11;
    }

    public static int B(int i, int i10, int i11, int i12) {
        return com.google.android.gms.internal.play_billing.x2.e0(i) + i10 + i11 + i12;
    }

    public static int C(int i, int i10, int i11) {
        return com.google.android.gms.internal.play_billing.x2.e0(i) + i10 + i11;
    }

    public static /* synthetic */ String D(int i) {
        switch (i) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String E(int i) {
        switch (i) {
            case 1:
                return "CONFIGURED";
            case 2:
                return "STARTED";
            case 3:
                return "PAUSED";
            case 4:
                return "STOPPING";
            case 5:
                return "PENDING_START";
            case 6:
                return "PENDING_START_PAUSED";
            case 7:
                return "PENDING_RELEASE";
            case 8:
                return "ERROR";
            case 9:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static final String a(int i) {
        int iM = t.z.m(i);
        if (iM == 0) {
            return "Activity is missing. This might happen when running a certain function from the background that requires a UI element (e.g. requesting permissions or enabling the location services).";
        }
        if (iM == 1) {
            return "An unexpected error occurred while trying to acquire the device's position.";
        }
        if (iM == 2) {
            return "Location services are disabled. To receive location updates the location services should be enabled.";
        }
        if (iM == 3) {
            return "No location permissions are defined in the manifest. Make sure at least ACCESS_FINE_LOCATION or ACCESS_COARSE_LOCATION are defined in the manifest.";
        }
        if (iM == 4) {
            return "User denied permissions to access the device's location.";
        }
        if (iM == 5) {
            return "Already listening for location updates. If you want to restart listening please cancel other subscriptions first";
        }
        throw new IndexOutOfBoundsException();
    }

    public static final String b(int i) {
        int iM = t.z.m(i);
        if (iM == 0) {
            return "ACTIVITY_MISSING";
        }
        if (iM == 1) {
            return "ERROR_WHILE_ACQUIRING_POSITION";
        }
        if (iM == 2) {
            return "LOCATION_SERVICES_DISABLED";
        }
        if (iM == 3) {
            return "PERMISSION_DEFINITIONS_NOT_FOUND";
        }
        if (iM == 4) {
            return "PERMISSION_DENIED";
        }
        if (iM == 5) {
            return "PERMISSION_REQUEST_IN_PROGRESS";
        }
        throw new IndexOutOfBoundsException();
    }

    public static int c(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ int d(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static int e(int i, int i10, int i11) {
        int i12 = i / i10;
        return i12 + i12 + i11;
    }

    public static int f(int i, int i10, int i11, int i12) {
        return hn1.N(i) + i10 + i11 + i12;
    }

    public static int g(int i, int i10, int i11, int i12, int i13) {
        return Math.max(((i * i10) / i11) + i12, i13);
    }

    public static ij.l h(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, str2);
        return com.google.android.gms.internal.measurement.h5.s(new fj.a(str3, str4, str5));
    }

    public static ClassCastException i(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String j(String str, int i, String str2, int i10, String str3) {
        return str + i + str2 + i10 + str3;
    }

    public static String k(String str, String str2) {
        return str + str2;
    }

    public static String l(StringBuilder sb2, int i, char c8) {
        sb2.append(i);
        sb2.append(c8);
        return sb2.toString();
    }

    public static String m(StringBuilder sb2, long j10, char c8) {
        sb2.append(j10);
        sb2.append(c8);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static StringBuilder o(String str, String str2, Integer num, Integer num2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(num);
        sb2.append(str2);
        sb2.append(num2);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder p(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static /* synthetic */ void q(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
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

    public static void r(String str, String str2, String str3) {
        com.google.android.gms.internal.measurement.h5.s(new fj.a(str, str2, str3));
    }

    public static void s(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, str2);
        com.google.android.gms.internal.measurement.h5.s(new fj.a(str3, str4, str5));
    }

    public static void t(StringBuilder sb2, int i, String str, int i10, String str2) {
        sb2.append(i);
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
    }

    public static void u(StringBuilder sb2, String str, int i, String str2, int i10) {
        sb2.append(str);
        sb2.append(i);
        sb2.append(str2);
        sb2.append(i10);
    }

    public static int v(int i, int i10, int i11) {
        return hn1.N(i) + i10 + i11;
    }

    public static int w(int i, int i10, int i11, int i12) {
        return com.google.android.gms.internal.consent_sdk.l5.i(i) + i10 + i11 + i12;
    }

    public static String x(String str, String str2) {
        return str + str2;
    }

    public static int y(int i, int i10, int i11) {
        return com.google.android.gms.internal.consent_sdk.l5.i(i) + i10 + i11;
    }

    public static int z(int i, int i10, int i11, int i12) {
        return com.google.android.gms.internal.measurement.a5.M(i) + i10 + i11 + i12;
    }
}
