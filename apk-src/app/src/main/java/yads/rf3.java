package yads;

import android.view.View;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rf3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf3 f42593b;

    public rf3(sf3 sf3Var) {
        this.f42593b = sf3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sf3 sf3Var = this.f42593b;
        if (!sf3Var.f42929d) {
            if (sf3Var.f42926a.f40913a.contains(kg3.f40194d)) {
                bg3 bg3Var = (bg3) this.f42593b.f42927b;
                eg3 eg3Var = bg3Var.f37021f;
                li3 li3Var = bg3Var.f37022g;
                li3Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!kotlin.jvm.internal.k0.d(linkedHashMap)) {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                View view = li3Var.f40559b.getView();
                Integer numValueOf = view != null ? Integer.valueOf(view.getHeight()) : null;
                Integer numValueOf2 = view != null ? Integer.valueOf(view.getWidth()) : null;
                ml1 ml1Var = li3Var.f40558a.f40901c;
                if (numValueOf == null || numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    linkedHashMap.put("view_container_height", StringUtils.UNDEFINED);
                } else {
                    linkedHashMap.put("view_container_height", numValueOf);
                }
                if (numValueOf2 == null || numValueOf2.intValue() <= 0) {
                    numValueOf2 = null;
                }
                if (numValueOf2 == null) {
                    linkedHashMap.put("view_container_width", StringUtils.UNDEFINED);
                } else {
                    linkedHashMap.put("view_container_width", numValueOf2);
                }
                int i = ml1Var.f40950g;
                Integer numValueOf3 = i > 0 ? Integer.valueOf(i) : null;
                if (numValueOf3 == null) {
                    linkedHashMap.put("video_height", StringUtils.UNDEFINED);
                } else {
                    linkedHashMap.put("video_height", numValueOf3);
                }
                int i10 = ml1Var.f40951h;
                Integer numValueOf4 = i10 > 0 ? Integer.valueOf(i10) : null;
                if (numValueOf4 == null) {
                    linkedHashMap.put("video_width", StringUtils.UNDEFINED);
                } else {
                    linkedHashMap.put("video_width", numValueOf4);
                }
                String str = ml1Var.f40948e;
                if (str == null) {
                    linkedHashMap.put("video_codec", StringUtils.UNDEFINED);
                } else {
                    linkedHashMap.put("video_codec", str);
                }
                String str2 = ml1Var.f40947d;
                if (str2 == null) {
                    linkedHashMap.put("video_mime_type", StringUtils.UNDEFINED);
                } else {
                    linkedHashMap.put("video_mime_type", str2);
                }
                Float f10 = ml1Var.f40949f;
                if (f10 == null) {
                    linkedHashMap.put("video_vmaf", StringUtils.UNDEFINED);
                } else {
                    linkedHashMap.put("video_vmaf", f10);
                }
                eg3Var.f38130f = kotlin.collections.i0.c(new Pair("video_playback_info", linkedHashMap));
                bg3Var.f37016a.a(v5.f43889u);
                if (!bg3Var.f37023h) {
                    bg3Var.f37023h = true;
                    eg3 eg3Var2 = bg3Var.f37021f;
                    eg3Var2.getClass();
                    eg3Var2.a(kotlin.collections.j0.h(new Pair("status", "success"), new Pair("durations", eg3Var2.f38128c.a())));
                }
                sf3 sf3Var2 = this.f42593b;
                sf3Var2.f42929d = true;
                sf3Var2.f42928c.removeCallbacksAndMessages(null);
                sf3Var2.f42930e = false;
                return;
            }
        }
        this.f42593b.f42928c.postDelayed(this, 200L);
    }
}
