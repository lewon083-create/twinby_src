package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ue {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f43633d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bh f43634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zg f43635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te f43636c;

    public /* synthetic */ ue(Context context) {
        this(new bh(), new zg(context), new te(context));
    }

    public final void a(Context context) {
        if (this.f43635b.b() && f43633d.compareAndSet(false, true)) {
            boolean z5 = !this.f43634a.f37025a.b(context);
            if (this.f43636c.f43290a.b()) {
                try {
                    ij.k kVar = ij.m.f21341c;
                    AppMetricaLibraryAdapter.activate(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().withAdvIdentifiersTracking(z5).build());
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    ij.k kVar2 = ij.m.f21341c;
                    com.google.android.gms.internal.measurement.h5.s(th2);
                }
            }
        }
    }

    public ue(bh bhVar, zg zgVar, te teVar) {
        this.f43634a = bhVar;
        this.f43635b = zgVar;
        this.f43636c = teVar;
    }
}
