package kotlin.text;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f27578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ s[] f27579d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27580b;

    static {
        s sVar = new s("IGNORE_CASE", 0, 2, 0, 2, null);
        f27578c = sVar;
        s[] sVarArr = {sVar, new s("MULTILINE", 1, 8, 0, 2, null), new s("LITERAL", 2, 16, 0, 2, null), new s("UNIX_LINES", 3, 1, 0, 2, null), new s("COMMENTS", 4, 4, 0, 2, null), new s("DOT_MATCHES_ALL", 5, 32, 0, 2, null), new s("CANON_EQ", 6, 128, 0, 2, null)};
        f27579d = sVarArr;
        hl.d.k(sVarArr);
    }

    public s(String str, int i, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this.f27580b = i10;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f27579d.clone();
    }
}
