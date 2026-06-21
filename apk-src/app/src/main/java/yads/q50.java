package yads;

import com.yandex.mobile.ads.R$style;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42189c;

    public q50(int i, int i10, String str) {
        this.f42187a = str;
        this.f42188b = i;
        this.f42189c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q50)) {
            return false;
        }
        q50 q50Var = (q50) obj;
        return Intrinsics.a(this.f42187a, q50Var.f42187a) && this.f42188b == q50Var.f42188b && this.f42189c == q50Var.f42189c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42189c) + qd3.a(this.f42188b, this.f42187a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f42187a;
        int i = this.f42188b;
        int i10 = this.f42189c;
        StringBuilder sb2 = new StringBuilder("DebugPanelColoredText(text=");
        sb2.append(str);
        sb2.append(", color=");
        sb2.append(i);
        sb2.append(", style=");
        return t.z.d(i10, ")", sb2);
    }

    public /* synthetic */ q50(String str, int i) {
        this(i, R$style.DebugPanelText_Body2, str);
    }
}
