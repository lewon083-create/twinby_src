package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import m1.d;
import m1.g;
import n1.b;
import p1.q;
import p1.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends s {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f1273k;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p1.s, p1.b
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        g gVar = new g();
        gVar.f28518s0 = 0;
        gVar.f28519t0 = 0;
        gVar.f28520u0 = 0;
        gVar.f28521v0 = 0;
        gVar.f28522w0 = 0;
        gVar.f28523x0 = 0;
        gVar.f28524y0 = false;
        gVar.f28525z0 = 0;
        gVar.A0 = 0;
        gVar.B0 = new b();
        gVar.C0 = null;
        gVar.D0 = -1;
        gVar.E0 = -1;
        gVar.F0 = -1;
        gVar.G0 = -1;
        gVar.H0 = -1;
        gVar.I0 = -1;
        gVar.J0 = 0.5f;
        gVar.K0 = 0.5f;
        gVar.L0 = 0.5f;
        gVar.M0 = 0.5f;
        gVar.N0 = 0.5f;
        gVar.O0 = 0.5f;
        gVar.P0 = 0;
        gVar.Q0 = 0;
        gVar.R0 = 2;
        gVar.S0 = 2;
        gVar.T0 = 0;
        gVar.U0 = -1;
        gVar.V0 = 0;
        gVar.W0 = new ArrayList();
        gVar.X0 = null;
        gVar.Y0 = null;
        gVar.Z0 = null;
        gVar.f28517b1 = 0;
        this.f1273k = gVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f30918b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f1273k.V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f1273k;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f28518s0 = dimensionPixelSize;
                    gVar2.f28519t0 = dimensionPixelSize;
                    gVar2.f28520u0 = dimensionPixelSize;
                    gVar2.f28521v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.f1273k;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f28520u0 = dimensionPixelSize2;
                    gVar3.f28522w0 = dimensionPixelSize2;
                    gVar3.f28523x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f1273k.f28521v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f1273k.f28522w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f1273k.f28518s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f1273k.f28523x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f1273k.f28519t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f1273k.T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f1273k.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f1273k.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f1273k.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f1273k.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f1273k.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f1273k.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f1273k.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f1273k.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f1273k.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f1273k.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f1273k.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f1273k.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f1273k.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f1273k.S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f1273k.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f1273k.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f1273k.U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f30771e = this.f1273k;
        i();
    }

    @Override // p1.b
    public final void h(d dVar, boolean z5) {
        g gVar = this.f1273k;
        int i = gVar.f28520u0;
        if (i > 0 || gVar.f28521v0 > 0) {
            if (z5) {
                gVar.f28522w0 = gVar.f28521v0;
                gVar.f28523x0 = i;
            } else {
                gVar.f28522w0 = i;
                gVar.f28523x0 = gVar.f28521v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:391:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x010f A[EDGE_INSN: B:430:0x010f->B:63:0x010f BREAK  A[LOOP:1: B:57:0x00f8->B:62:0x010a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0140  */
    @Override // p1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(m1.g r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 1901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.j(m1.g, int, int):void");
    }

    @Override // p1.b, android.view.View
    public final void onMeasure(int i, int i10) {
        j(this.f1273k, i, i10);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f1273k.L0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f1273k.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f1273k.M0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f1273k.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f1273k.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f1273k.J0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f1273k.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f1273k.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f1273k.N0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f1273k.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f1273k.O0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f1273k.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f1273k.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f1273k.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        g gVar = this.f1273k;
        gVar.f28518s0 = i;
        gVar.f28519t0 = i;
        gVar.f28520u0 = i;
        gVar.f28521v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f1273k.f28519t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f1273k.f28522w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f1273k.f28523x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f1273k.f28518s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f1273k.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f1273k.K0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f1273k.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f1273k.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f1273k.T0 = i;
        requestLayout();
    }
}
