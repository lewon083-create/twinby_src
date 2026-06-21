package yads;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jl3 implements fe1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final jl3 f39901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final jl3 f39902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final jl3 f39903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ jl3[] f39904f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39905b;

    static {
        jl3 jl3Var = new jl3(0, "DEFAULT", "default");
        f39901c = jl3Var;
        jl3 jl3Var2 = new jl3(1, "LOADING", "loading");
        f39902d = jl3Var2;
        jl3 jl3Var3 = new jl3(2, "HIDDEN", "hidden");
        f39903e = jl3Var3;
        jl3[] jl3VarArr = {jl3Var, jl3Var2, jl3Var3};
        f39904f = jl3VarArr;
        hl.d.k(jl3VarArr);
    }

    public jl3(int i, String str, String str2) {
        this.f39905b = str2;
    }

    public static jl3 valueOf(String str) {
        return (jl3) Enum.valueOf(jl3.class, str);
    }

    public static jl3[] values() {
        return (jl3[]) f39904f.clone();
    }

    @Override // yads.fe1
    public final String a() {
        String str = String.format("state: %s", Arrays.copyOf(new Object[]{JSONObject.quote(this.f39905b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
