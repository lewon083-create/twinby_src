package fj;

import fh.nd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nd f19341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e1[] f19342d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19343b;

    static {
        e1[] e1VarArr = {new e1("SYSTEM_BARS", 0, 0), new e1("DISPLAY_CUTOUT", 1, 1), new e1("CAPTION_BAR", 2, 2), new e1("IME", 3, 3), new e1("MANDATORY_SYSTEM_GESTURES", 4, 4), new e1("NAVIGATION_BARS", 5, 5), new e1("STATUS_BARS", 6, 6), new e1("SYSTEM_GESTURES", 7, 7), new e1("TAPPABLE_ELEMENT", 8, 8)};
        f19342d = e1VarArr;
        hl.d.k(e1VarArr);
        f19341c = new nd();
    }

    public e1(String str, int i, int i10) {
        this.f19343b = i10;
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) f19342d.clone();
    }
}
