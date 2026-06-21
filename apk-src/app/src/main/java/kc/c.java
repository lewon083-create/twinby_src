package kc;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.gms.internal.measurement.d4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f27358h;
    public final /* synthetic */ TextPaint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d4 f27359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f27360k;

    public c(d dVar, Context context, TextPaint textPaint, d4 d4Var) {
        this.f27360k = dVar;
        this.f27358h = context;
        this.i = textPaint;
        this.f27359j = d4Var;
    }

    @Override // com.google.android.gms.internal.measurement.d4
    public final void s(int i) {
        this.f27359j.s(i);
    }

    @Override // com.google.android.gms.internal.measurement.d4
    public final void t(Typeface typeface, boolean z5) {
        this.f27360k.g(this.f27358h, this.i, typeface);
        this.f27359j.t(typeface, z5);
    }
}
