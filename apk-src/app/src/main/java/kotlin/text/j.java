package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final g f27557d = new g(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f27558e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f27560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f27561c;

    static {
        e eVar = f.f27552a;
        eVar.getClass();
        f fVar = f.f27553b;
        h hVar = i.f27554b;
        hVar.getClass();
        i iVar = i.f27555c;
        f27558e = new j(false, fVar, iVar);
        eVar.getClass();
        hVar.getClass();
        new j(true, fVar, iVar);
    }

    public j(boolean z5, f bytes, i number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f27559a = z5;
        this.f27560b = bytes;
        this.f27561c = number;
    }

    public final String toString() {
        StringBuilder sbJ = pe.a.j("HexFormat(\n    upperCase = ");
        sbJ.append(this.f27559a);
        sbJ.append(",\n    bytes = BytesHexFormat(\n");
        this.f27560b.a(sbJ, "        ");
        sbJ.append('\n');
        sbJ.append("    ),");
        sbJ.append('\n');
        sbJ.append("    number = NumberHexFormat(");
        sbJ.append('\n');
        this.f27561c.a(sbJ, "        ");
        sbJ.append('\n');
        sbJ.append("    )");
        sbJ.append('\n');
        sbJ.append(")");
        return sbJ.toString();
    }
}
