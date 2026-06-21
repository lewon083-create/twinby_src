package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ReporterConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class eh extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fq3 f38131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f38132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh f38133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f38134e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(fq3 fq3Var, Context context, fh fhVar, String str) {
        super(0);
        this.f38131b = fq3Var;
        this.f38132c = context;
        this.f38133d = fhVar;
        this.f38134e = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        fq3 fq3Var = this.f38131b;
        fq3Var.f38534a.a(this.f38132c);
        fh fhVar = this.f38133d;
        Context context = this.f38132c;
        String str = this.f38134e;
        if (fhVar.f38443a.a()) {
            try {
                AppMetrica.activateReporter(context, ReporterConfig.newConfigBuilder(str).build());
            } catch (Throwable unused) {
            }
        }
        return AppMetrica.getReporter(this.f38132c, this.f38134e);
    }
}
