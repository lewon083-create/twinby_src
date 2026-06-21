package yads;

import android.content.Context;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f43230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f43231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j8 f43232c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AdQualityVerificationResult f43233e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ij.g f43234g;

    public t8(d4 d4Var, Context context, j8 j8Var) {
        this.f43230a = d4Var;
        this.f43231b = context;
        this.f43232c = j8Var;
        this.f43233e = AdQualityVerificationResult.WaitingForVerification.INSTANCE;
        this.f43234g = ij.h.b(new r8(this));
    }

    public /* synthetic */ t8(d4 d4Var, nu2 nu2Var, Context context) {
        this(d4Var, context, new j8(d4Var, nu2Var));
    }
}
