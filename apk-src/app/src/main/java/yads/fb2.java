package yads;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fb2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    public static ArrayList a(View view) {
        ArrayList arrayList = new ArrayList();
        zl3 zl3Var = nl3.f41290a;
        ViewParent parent = view.getParent();
        ?? r22 = view;
        ?? r12 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        while (r12 != 0) {
            int childCount = r12.getChildCount();
            for (int iIndexOfChild = r12.indexOfChild(r22) + 1; iIndexOfChild < childCount; iIndexOfChild++) {
                arrayList.addAll(b(r12.getChildAt(iIndexOfChild)));
            }
            ViewParent parent2 = r12.getParent();
            ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            r22 = r12;
            r12 = viewGroup;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (view.getZ() <= ((View) obj).getZ()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static List b(View view) {
        jj.e eVarB = kotlin.collections.r.b();
        if (!nl3.b(view)) {
            if (!(view instanceof ViewGroup) || nl3.c(view)) {
                eVarB.add(view);
            } else {
                ViewGroup viewGroup = (ViewGroup) view;
                jj.e eVarB2 = kotlin.collections.r.b();
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    eVarB2.addAll(b(viewGroup.getChildAt(i)));
                }
                eVarB.addAll(kotlin.collections.r.a(eVarB2));
            }
        }
        return kotlin.collections.r.a(eVarB);
    }
}
