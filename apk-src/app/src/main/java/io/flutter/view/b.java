package io.flutter.view;

import android.opengl.Matrix;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements yh.f, yh.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f25784a;

    public /* synthetic */ b(Object obj) {
        this.f25784a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        Iterator it;
        long j10;
        g gVar;
        int i;
        int i10;
        g gVar2;
        String str;
        float f10;
        float f11;
        View viewF;
        Integer num;
        View viewF2;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        h hVar = (h) this.f25784a;
        HashMap map = hVar.f25852g;
        io.flutter.plugin.platform.j jVar = hVar.f25850e;
        ArrayList arrayList = hVar.f25861q;
        ArrayList arrayList2 = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            g gVarC = hVar.c(byteBuffer.getInt());
            ArrayList arrayList3 = gVarC.U;
            h hVar2 = gVarC.f25817a;
            gVarC.E = true;
            gVarC.K = gVarC.f25836r;
            gVarC.L = gVarC.f25834p;
            gVarC.F = gVarC.f25821c;
            gVarC.G = gVarC.f25823d;
            gVarC.H = gVarC.f25826g;
            gVarC.I = gVarC.f25827h;
            gVarC.J = gVarC.f25830l;
            gVarC.f25821c = byteBuffer.getLong();
            gVarC.f25823d = byteBuffer.getInt();
            gVarC.f25824e = byteBuffer.getInt();
            gVarC.f25825f = byteBuffer.getInt();
            gVarC.f25826g = byteBuffer.getInt();
            gVarC.f25827h = byteBuffer.getInt();
            gVarC.i = byteBuffer.getInt();
            gVarC.f25828j = byteBuffer.getInt();
            gVarC.f25829k = byteBuffer.getInt();
            byteBuffer.getInt();
            gVarC.f25830l = byteBuffer.getFloat();
            gVarC.f25831m = byteBuffer.getFloat();
            gVarC.f25832n = byteBuffer.getFloat();
            gVarC.f25833o = h.d(byteBuffer, strArr);
            gVarC.f25834p = h.d(byteBuffer, strArr);
            gVarC.f25835q = g.f(byteBuffer, byteBufferArr);
            gVarC.f25836r = h.d(byteBuffer, strArr);
            gVarC.f25837s = g.f(byteBuffer, byteBufferArr);
            gVarC.f25838t = h.d(byteBuffer, strArr);
            gVarC.f25839u = g.f(byteBuffer, byteBufferArr);
            gVarC.f25840v = h.d(byteBuffer, strArr);
            gVarC.f25841w = g.f(byteBuffer, byteBufferArr);
            gVarC.f25842x = h.d(byteBuffer, strArr);
            gVarC.f25843y = g.f(byteBuffer, byteBufferArr);
            gVarC.f25844z = h.d(byteBuffer, strArr);
            gVarC.A = h.d(byteBuffer, strArr);
            gVarC.B = h.d(byteBuffer, strArr);
            gVarC.C = byteBuffer.getInt();
            byteBuffer.getInt();
            gVarC.M = byteBuffer.getFloat();
            gVarC.N = byteBuffer.getFloat();
            gVarC.O = byteBuffer.getFloat();
            gVarC.P = byteBuffer.getFloat();
            float[] fArr = gVarC.Q;
            if (fArr == null) {
                fArr = new float[16];
            }
            for (int i11 = 0; i11 < 16; i11++) {
                fArr[i11] = byteBuffer.getFloat();
            }
            gVarC.Q = fArr;
            float[] fArr2 = gVarC.R;
            if (fArr2 == null) {
                fArr2 = new float[16];
            }
            for (int i12 = 0; i12 < 16; i12++) {
                fArr2[i12] = byteBuffer.getFloat();
            }
            gVarC.R = fArr2;
            gVarC.Y = true;
            gVarC.f25818a0 = true;
            int i13 = byteBuffer.getInt();
            ArrayList arrayList4 = gVarC.T;
            arrayList4.clear();
            for (int i14 = 0; i14 < i13; i14++) {
                g gVarC2 = hVar2.c(byteBuffer.getInt());
                gVarC2.S = gVarC;
                arrayList4.add(gVarC2);
            }
            int i15 = byteBuffer.getInt();
            arrayList3.clear();
            for (int i16 = 0; i16 < i15; i16++) {
                g gVarC3 = hVar2.c(byteBuffer.getInt());
                gVarC3.S = gVarC;
                arrayList3.add(gVarC3);
            }
            int i17 = byteBuffer.getInt();
            if (i17 == 0) {
                gVarC.V = null;
            } else {
                ArrayList arrayList5 = gVarC.V;
                if (arrayList5 == null) {
                    gVarC.V = new ArrayList(i17);
                } else {
                    arrayList5.clear();
                }
                for (int i18 = 0; i18 < i17; i18++) {
                    f fVarB = hVar2.b(byteBuffer.getInt());
                    int i19 = fVarB.f25814c;
                    if (i19 == 1) {
                        gVarC.W = fVarB;
                    } else if (i19 == 2) {
                        gVarC.X = fVarB;
                    } else {
                        gVarC.V.add(fVarB);
                    }
                    gVarC.V.add(fVarB);
                }
            }
            if (!gVarC.g(14)) {
                if (gVarC.g(6)) {
                    hVar.f25858n = gVarC;
                }
                if (gVarC.E) {
                    arrayList2.add(gVarC);
                }
                int i20 = gVarC.i;
                if (i20 != -1 && !jVar.o(i20) && (viewF2 = jVar.f(gVarC.i)) != null) {
                    viewF2.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        g gVar3 = (g) map.get(0);
        ArrayList<g> arrayList6 = new ArrayList();
        if (gVar3 != null) {
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            gVar3.k(fArr3, hashSet, false);
            gVar3.c(arrayList6);
        }
        g gVar4 = null;
        for (g gVar5 : arrayList6) {
            if (!arrayList.contains(Integer.valueOf(gVar5.f25819b))) {
                gVar4 = gVar5;
            }
        }
        if (gVar4 == null && !arrayList6.isEmpty()) {
            gVar4 = (g) gf.a.g(1, arrayList6);
        }
        if (gVar4 != null && (gVar4.f25819b != hVar.f25862r || arrayList6.size() != arrayList.size())) {
            hVar.f25862r = gVar4.f25819b;
            String strE = gVar4.e();
            if (strE == null) {
                strE = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                hVar.f25846a.setAccessibilityPaneTitle(strE);
            } else {
                AccessibilityEvent accessibilityEventE = hVar.e(gVar4.f25819b, 32);
                accessibilityEventE.getText().add(strE);
                hVar.i(accessibilityEventE);
            }
        }
        arrayList.clear();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((g) it2.next()).f25819b));
        }
        Iterator it3 = map.entrySet().iterator();
        while (it3.hasNext()) {
            g gVar6 = (g) ((Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(gVar6)) {
                gVar6.S = null;
                if (gVar6.i != -1 && (num = hVar.f25854j) != null && hVar.f25849d.platformViewOfNode(num.intValue()) == jVar.f(gVar6.i)) {
                    hVar.h(hVar.f25854j.intValue(), 65536);
                    hVar.f25854j = null;
                }
                int i21 = gVar6.i;
                if (i21 != -1 && (viewF = jVar.f(i21)) != null) {
                    viewF.setImportantForAccessibility(4);
                }
                g gVar7 = hVar.i;
                if (gVar7 == gVar6) {
                    hVar.h(gVar7.f25819b, 65536);
                    hVar.i = null;
                }
                if (hVar.f25858n == gVar6) {
                    hVar.f25858n = null;
                }
                if (hVar.f25860p == gVar6) {
                    hVar.f25860p = null;
                }
                it3.remove();
            }
        }
        int i22 = 2048;
        AccessibilityEvent accessibilityEventE2 = hVar.e(0, 2048);
        accessibilityEventE2.setContentChangeTypes(1);
        hVar.i(accessibilityEventE2);
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            g gVar8 = (g) it4.next();
            if (!Float.isNaN(gVar8.f25830l) && !Float.isNaN(gVar8.J) && gVar8.J != gVar8.f25830l) {
                AccessibilityEvent accessibilityEventE3 = hVar.e(gVar8.f25819b, 4096);
                float f12 = gVar8.f25830l;
                float f13 = gVar8.f25831m;
                if (Float.isInfinite(f13)) {
                    if (f12 > 70000.0f) {
                        f12 = 70000.0f;
                    }
                    f13 = 100000.0f;
                }
                if (Float.isInfinite(gVar8.f25832n)) {
                    f10 = f13 + 100000.0f;
                    if (f12 < -70000.0f) {
                        f12 = -70000.0f;
                    }
                    f11 = f12 + 100000.0f;
                } else {
                    float f14 = gVar8.f25832n;
                    f10 = f13 - f14;
                    f11 = f12 - f14;
                }
                int i23 = gVar8.G;
                if ((i23 & 16) != 0 || (i23 & 32) != 0) {
                    accessibilityEventE3.setScrollY((int) f11);
                    accessibilityEventE3.setMaxScrollY((int) f10);
                } else if ((i23 & 4) != 0 || (i23 & 8) != 0) {
                    accessibilityEventE3.setScrollX((int) f11);
                    accessibilityEventE3.setMaxScrollX((int) f10);
                }
                int i24 = gVar8.f25828j;
                if (i24 > 0) {
                    accessibilityEventE3.setItemCount(i24);
                    accessibilityEventE3.setFromIndex(gVar8.f25829k);
                    Iterator it5 = gVar8.U.iterator();
                    int i25 = 0;
                    while (it5.hasNext()) {
                        if (!((g) it5.next()).g(14)) {
                            i25++;
                        }
                    }
                    accessibilityEventE3.setToIndex((gVar8.f25829k + i25) - 1);
                }
                hVar.i(accessibilityEventE3);
            }
            if (gVar8.g(16) && (((str = gVar8.f25834p) != null || gVar8.L != null) && (str == null || !str.equals(gVar8.L)))) {
                AccessibilityEvent accessibilityEventE4 = hVar.e(gVar8.f25819b, i22);
                accessibilityEventE4.setContentChangeTypes(1);
                hVar.i(accessibilityEventE4);
            }
            g gVar9 = hVar.i;
            if (gVar9 == null || gVar9.f25819b != gVar8.f25819b) {
                it = it4;
                j10 = 0;
            } else {
                it = it4;
                j10 = 0;
                if ((gVar8.F & ((long) gf.a.d(3))) == 0 && gVar8.g(3)) {
                    AccessibilityEvent accessibilityEventE5 = hVar.e(gVar8.f25819b, 4);
                    accessibilityEventE5.getText().add(gVar8.f25834p);
                    hVar.i(accessibilityEventE5);
                }
            }
            g gVar10 = hVar.f25858n;
            if (gVar10 != null && (i = gVar10.f25819b) == (i10 = gVar8.f25819b) && ((gVar2 = hVar.f25859o) == null || gVar2.f25819b != i)) {
                hVar.f25859o = gVar10;
                hVar.i(hVar.e(i10, 8));
            } else if (gVar10 == null) {
                hVar.f25859o = null;
            }
            g gVar11 = hVar.f25858n;
            if (gVar11 != null && gVar11.f25819b == gVar8.f25819b && (gVar8.F & ((long) gf.a.d(5))) != j10 && gVar8.g(5) && ((gVar = hVar.i) == null || gVar.f25819b == hVar.f25858n.f25819b)) {
                String str2 = gVar8.K;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = gVar8.f25836r;
                String str4 = str3 != null ? str3 : "";
                AccessibilityEvent accessibilityEventE6 = hVar.e(gVar8.f25819b, 16);
                accessibilityEventE6.setBeforeText(str2);
                accessibilityEventE6.getText().add(str4);
                int i26 = 0;
                while (i26 < str2.length() && i26 < str4.length() && str2.charAt(i26) == str4.charAt(i26)) {
                    i26++;
                }
                if (i26 < str2.length() || i26 < str4.length()) {
                    accessibilityEventE6.setFromIndex(i26);
                    int length = str2.length() - 1;
                    int length2 = str4.length() - 1;
                    while (length >= i26 && length2 >= i26 && str2.charAt(length) == str4.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    accessibilityEventE6.setRemovedCount((length - i26) + 1);
                    accessibilityEventE6.setAddedCount((length2 - i26) + 1);
                } else {
                    accessibilityEventE6 = null;
                }
                if (accessibilityEventE6 != null) {
                    hVar.i(accessibilityEventE6);
                }
                if (gVar8.H != gVar8.f25826g || gVar8.I != gVar8.f25827h) {
                    AccessibilityEvent accessibilityEventE7 = hVar.e(gVar8.f25819b, 8192);
                    accessibilityEventE7.getText().add(str4);
                    accessibilityEventE7.setFromIndex(gVar8.f25826g);
                    accessibilityEventE7.setToIndex(gVar8.f25827h);
                    accessibilityEventE7.setItemCount(str4.length());
                    hVar.i(accessibilityEventE7);
                }
            }
            it4 = it;
            i22 = 2048;
        }
    }
}
