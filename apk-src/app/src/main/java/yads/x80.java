package yads;

import com.yandex.mobile.ads.R$attr;
import com.yandex.mobile.ads.R$style;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f44620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44621d;

    public x80(String str, int i, Integer num, int i10) {
        this.f44618a = str;
        this.f44619b = i;
        this.f44620c = num;
        this.f44621d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x80)) {
            return false;
        }
        x80 x80Var = (x80) obj;
        return Intrinsics.a(this.f44618a, x80Var.f44618a) && this.f44619b == x80Var.f44619b && Intrinsics.a(this.f44620c, x80Var.f44620c) && this.f44621d == x80Var.f44621d;
    }

    public final int hashCode() {
        int iA = qd3.a(this.f44619b, this.f44618a.hashCode() * 31, 31);
        Integer num = this.f44620c;
        return Integer.hashCode(this.f44621d) + ((iA + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "DebugPanelTextWithIcon(text=" + this.f44618a + ", color=" + this.f44619b + ", icon=" + this.f44620c + ", style=" + this.f44621d + ")";
    }

    public /* synthetic */ x80(String str, int i, Integer num, int i10, int i11) {
        this(str, (i11 & 2) != 0 ? R$attr.debug_panel_label_primary : i, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? R$style.DebugPanelText_Body1 : i10);
    }
}
