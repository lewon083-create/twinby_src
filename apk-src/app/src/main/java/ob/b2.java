package ob;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29955b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f29958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f29959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f29960g;

    public b2(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.l0 l0Var, String str, String str2, boolean z5) {
        this.f29959f = l0Var;
        this.f29956c = str;
        this.f29957d = str2;
        this.f29958e = z5;
        this.f29960g = appMeasurementDynamiteService;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010b A[Catch: RuntimeException -> 0x00e5, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:67:0x0154, B:70:0x016d, B:72:0x017c, B:71:0x0174, B:73:0x018f, B:75:0x0195, B:77:0x019b, B:79:0x01a1, B:81:0x01a7, B:83:0x01af, B:85:0x01b7, B:87:0x01bd, B:88:0x01cf, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:100:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0154 A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:67:0x0154, B:70:0x016d, B:72:0x017c, B:71:0x0174, B:73:0x018f, B:75:0x0195, B:77:0x019b, B:79:0x01a1, B:81:0x01a7, B:83:0x01af, B:85:0x01b7, B:87:0x01bd, B:88:0x01cf, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:100:0x0094 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.b2.run():void");
    }

    public b2(com.google.firebase.messaging.j jVar, boolean z5, Uri uri, String str, String str2) {
        this.f29958e = z5;
        this.f29959f = uri;
        this.f29956c = str;
        this.f29957d = str2;
        this.f29960g = jVar;
    }

    public b2(k2 k2Var, AtomicReference atomicReference, String str, String str2, boolean z5) {
        this.f29959f = atomicReference;
        this.f29956c = str;
        this.f29957d = str2;
        this.f29958e = z5;
        Objects.requireNonNull(k2Var);
        this.f29960g = k2Var;
    }

    public b2(d3 d3Var, g4 g4Var, boolean z5, u uVar, Bundle bundle) {
        this.f29959f = g4Var;
        this.f29958e = z5;
        this.f29956c = uVar;
        this.f29957d = bundle;
        Objects.requireNonNull(d3Var);
        this.f29960g = d3Var;
    }
}
