package io.appmetrica.analytics.gpllibrary.internal;

import ac.h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.w;
import com.google.android.gms.location.LocationRequest;
import fh.of;
import java.util.concurrent.Executor;
import kb.a;
import kb.c;
import kb.d;
import kb.l;
import na.b;
import na.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f21899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationListener f21900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f21901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Looper f21902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f21903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f21904f;

    /* JADX INFO: renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21905a;

        static {
            int[] iArr = new int[Priority.values().length];
            f21905a = iArr;
            try {
                iArr[Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21905a[Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21905a[Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class ClientProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f21906a;

        public ClientProvider(Context context) {
            this.f21906a = context;
        }

        public final a a() {
            Context context = this.f21906a;
            int i = d.f27332a;
            return new gb.a(context, null, gb.a.f20065m, b.V1, e.f29187c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(@NonNull Context context, @NonNull LocationListener locationListener, @NonNull Looper looper, @NonNull Executor executor, long j10) {
        this(new ClientProvider(context), locationListener, looper, executor, j10);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void startLocationUpdates(@NonNull Priority priority) {
        a aVar = this.f21899a;
        LocationRequest locationRequestC = LocationRequest.c();
        locationRequestC.f(this.f21904f);
        int i = AnonymousClass1.f21905a[priority.ordinal()];
        int i10 = i != 1 ? i != 2 ? i != 3 ? 105 : 100 : 102 : 104;
        l.a(i10);
        locationRequestC.f14400b = i10;
        ((gb.a) aVar).g(locationRequestC, this.f21901c, this.f21902d);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() {
        ((gb.a) this.f21899a).f(this.f21901c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void updateLastKnownLocation() {
        gb.a aVar = (gb.a) this.f21899a;
        aVar.getClass();
        h hVarA = w.a();
        hVarA.f753d = of.f18034b;
        hVarA.f752c = 2414;
        aVar.e(0, hVarA.a()).d(this.f21903e, new GplOnSuccessListener(this.f21900b));
    }

    public GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j10) {
        this.f21899a = clientProvider.a();
        this.f21900b = locationListener;
        this.f21902d = looper;
        this.f21903e = executor;
        this.f21904f = j10;
        this.f21901c = new GplLocationCallback(locationListener);
    }
}
