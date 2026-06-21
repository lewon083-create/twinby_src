package u6;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.su1;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 extends r {
    private static final String[] sTransitionProperties = {"android:visibility:visibility", "android:visibility:parent"};
    private int mMode = 3;

    public static void e(z zVar) {
        int visibility = zVar.f34310b.getVisibility();
        HashMap map = zVar.f34309a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = zVar.f34310b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.su1 f(u6.z r8, u6.z r9) {
        /*
            com.google.android.gms.internal.ads.su1 r0 = new com.google.android.gms.internal.ads.su1
            r0.<init>()
            r1 = 0
            r0.f10397c = r1
            r0.f10398d = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f34309a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f10395a = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f10399e = r6
            goto L33
        L2f:
            r0.f10395a = r3
            r0.f10399e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f34309a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f10396b = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f10400f = r2
            goto L56
        L52:
            r0.f10396b = r3
            r0.f10400f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L92
            if (r9 == 0) goto L92
            int r8 = r0.f10395a
            int r9 = r0.f10396b
            if (r8 != r9) goto L6c
            java.lang.Object r3 = r0.f10399e
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r4 = r0.f10400f
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r3 != r4) goto L6c
            goto La7
        L6c:
            if (r8 == r9) goto L7c
            if (r8 != 0) goto L75
            r0.f10398d = r1
            r0.f10397c = r2
            return r0
        L75:
            if (r9 != 0) goto La7
            r0.f10398d = r2
            r0.f10397c = r2
            return r0
        L7c:
            java.lang.Object r8 = r0.f10400f
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 != 0) goto L87
            r0.f10398d = r1
            r0.f10397c = r2
            return r0
        L87:
            java.lang.Object r8 = r0.f10399e
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 != 0) goto La7
            r0.f10398d = r2
            r0.f10397c = r2
            return r0
        L92:
            if (r8 != 0) goto L9d
            int r8 = r0.f10396b
            if (r8 != 0) goto L9d
            r0.f10398d = r2
            r0.f10397c = r2
            return r0
        L9d:
            if (r9 != 0) goto La7
            int r8 = r0.f10395a
            if (r8 != 0) goto La7
            r0.f10398d = r1
            r0.f10397c = r2
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.g0.f(u6.z, u6.z):com.google.android.gms.internal.ads.su1");
    }

    @Override // u6.r
    public void captureEndValues(z zVar) {
        e(zVar);
    }

    @Override // u6.r
    public void captureStartValues(z zVar) {
        e(zVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (f(getMatchedTransitionValues(r5, false), getTransitionValues(r5, false)).f10397c != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022a  */
    @Override // u6.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator createAnimator(android.view.ViewGroup r25, u6.z r26, u6.z r27) {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.g0.createAnimator(android.view.ViewGroup, u6.z, u6.z):android.animation.Animator");
    }

    @Override // u6.r
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // u6.r
    public boolean isTransitionRequired(z zVar, z zVar2) {
        if (zVar == null && zVar2 == null) {
            return false;
        }
        if (zVar != null && zVar2 != null && zVar2.f34309a.containsKey("android:visibility:visibility") != zVar.f34309a.containsKey("android:visibility:visibility")) {
            return false;
        }
        su1 su1VarF = f(zVar, zVar2);
        if (su1VarF.f10397c) {
            return su1VarF.f10395a == 0 || su1VarF.f10396b == 0;
        }
        return false;
    }

    public abstract Animator onAppear(ViewGroup viewGroup, View view, z zVar, z zVar2);

    public abstract Animator onDisappear(ViewGroup viewGroup, View view, z zVar, z zVar2);

    public void setMode(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i;
    }
}
