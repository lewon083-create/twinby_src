package yads;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator f39972c = new zl.v(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o20 f39973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39974b;

    public jt(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i, float f11, int i10, boolean z5, int i11, int i12) {
        n20 n20VarB = new n20().a(spannableStringBuilder).a(alignment).a(f10).a(i).b(f11).b(i10).b();
        if (z5) {
            n20VarB.c(i11);
        }
        this.f39973a = n20VarB.a();
        this.f39974b = i12;
    }
}
