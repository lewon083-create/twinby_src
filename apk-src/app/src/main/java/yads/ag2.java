package yads;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ag2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ag2[] f36707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ pj.a f36708d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f36709b;

    static {
        ag2[] ag2VarArr = {new ag2("Flutter", 0, kotlin.collections.r.c("io.flutter.embedding.android.FlutterActivity")), new ag2("ReactNative", 1, kotlin.collections.r.c("com.facebook.react.bridge.ReactContext")), new ag2("Unity", 2, kotlin.collections.s.f("com.unity3d.player.UnityPlayer", "com.unity3d.player.UnityPlayerActivity"))};
        f36707c = ag2VarArr;
        f36708d = hl.d.k(ag2VarArr);
    }

    public ag2(String str, int i, List list) {
        this.f36709b = list;
    }

    public static ag2 valueOf(String str) {
        return (ag2) Enum.valueOf(ag2.class, str);
    }

    public static ag2[] values() {
        return (ag2[]) f36707c.clone();
    }
}
