package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final h f27554b = new h(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f27555c = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27556a;

    public i() {
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "suffix");
        this.f27556a = true;
        if (f0.a("")) {
            return;
        }
        f0.a("");
    }

    public final void a(StringBuilder sb2, String indent) {
        Intrinsics.checkNotNullParameter(sb2, "sb");
        Intrinsics.checkNotNullParameter(indent, "indent");
        sb2.append(indent);
        sb2.append("prefix = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        l7.o.t(sb2, indent, "suffix = \"", "", "\",");
        sb2.append('\n');
        sb2.append(indent);
        sb2.append("removeLeadingZeros = ");
        sb2.append(false);
        sb2.append(',');
        sb2.append('\n');
        sb2.append(indent);
        sb2.append("minLength = ");
        sb2.append(1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NumberHexFormat(\n");
        a(sb2, "    ");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
