package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import b8.a;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import l6.i;
import m1.e;
import m1.h;
import org.xmlpull.v1.XmlPullParserException;
import p1.b;
import p1.c;
import p1.d;
import p1.f;
import p1.m;
import p1.n;
import p1.o;
import p1.q;
import p1.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static r f1276q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f1277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f1279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1283h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m f1285k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i f1286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashMap f1288n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SparseArray f1289o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p1.e f1290p;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1277b = new SparseArray();
        this.f1278c = new ArrayList(4);
        this.f1279d = new e();
        this.f1280e = 0;
        this.f1281f = 0;
        this.f1282g = Integer.MAX_VALUE;
        this.f1283h = Integer.MAX_VALUE;
        this.i = true;
        this.f1284j = 257;
        this.f1285k = null;
        this.f1286l = null;
        this.f1287m = -1;
        this.f1288n = new HashMap();
        this.f1289o = new SparseArray();
        this.f1290p = new p1.e(this, this);
        i(attributeSet, 0);
    }

    public static d g() {
        d dVar = new d(-2, -2);
        dVar.f30776a = -1;
        dVar.f30778b = -1;
        dVar.f30780c = -1.0f;
        dVar.f30782d = true;
        dVar.f30784e = -1;
        dVar.f30786f = -1;
        dVar.f30788g = -1;
        dVar.f30790h = -1;
        dVar.i = -1;
        dVar.f30792j = -1;
        dVar.f30794k = -1;
        dVar.f30796l = -1;
        dVar.f30798m = -1;
        dVar.f30800n = -1;
        dVar.f30802o = -1;
        dVar.f30803p = -1;
        dVar.f30805q = 0;
        dVar.f30806r = 0.0f;
        dVar.f30807s = -1;
        dVar.f30808t = -1;
        dVar.f30809u = -1;
        dVar.f30810v = -1;
        dVar.f30811w = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.f30812x = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.f30813y = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.f30814z = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.A = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.B = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.C = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.D = 0;
        dVar.E = 0.5f;
        dVar.F = 0.5f;
        dVar.G = null;
        dVar.H = -1.0f;
        dVar.I = -1.0f;
        dVar.J = 0;
        dVar.K = 0;
        dVar.L = 0;
        dVar.M = 0;
        dVar.N = 0;
        dVar.O = 0;
        dVar.P = 0;
        dVar.Q = 0;
        dVar.R = 1.0f;
        dVar.S = 1.0f;
        dVar.T = -1;
        dVar.U = -1;
        dVar.V = -1;
        dVar.W = false;
        dVar.X = false;
        dVar.Y = null;
        dVar.Z = 0;
        dVar.f30777a0 = true;
        dVar.f30779b0 = true;
        dVar.f30781c0 = false;
        dVar.f30783d0 = false;
        dVar.f30785e0 = false;
        dVar.f30787f0 = -1;
        dVar.f30789g0 = -1;
        dVar.h0 = -1;
        dVar.f30791i0 = -1;
        dVar.f30793j0 = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.f30795k0 = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.f30797l0 = 0.5f;
        dVar.f30804p0 = new m1.d();
        return dVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static r getSharedValues() {
        if (f1276q == null) {
            r rVar = new r();
            new SparseIntArray();
            new HashMap();
            f1276q = rVar;
        }
        return f1276q;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1278c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((b) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(StringUtils.COMMA);
                    if (strArrSplit.length == 4) {
                        int i11 = Integer.parseInt(strArrSplit[0]);
                        int i12 = Integer.parseInt(strArrSplit[1]);
                        int i13 = Integer.parseInt(strArrSplit[2]);
                        int i14 = (int) ((i11 / 1080.0f) * width);
                        int i15 = (int) ((i12 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i14;
                        float f11 = i15;
                        float f12 = i14 + ((int) ((i13 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i15 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.i = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f30776a = -1;
        dVar.f30778b = -1;
        dVar.f30780c = -1.0f;
        dVar.f30782d = true;
        dVar.f30784e = -1;
        dVar.f30786f = -1;
        dVar.f30788g = -1;
        dVar.f30790h = -1;
        dVar.i = -1;
        dVar.f30792j = -1;
        dVar.f30794k = -1;
        dVar.f30796l = -1;
        dVar.f30798m = -1;
        dVar.f30800n = -1;
        dVar.f30802o = -1;
        dVar.f30803p = -1;
        dVar.f30805q = 0;
        dVar.f30806r = 0.0f;
        dVar.f30807s = -1;
        dVar.f30808t = -1;
        dVar.f30809u = -1;
        dVar.f30810v = -1;
        dVar.f30811w = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.f30812x = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.f30813y = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.f30814z = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.A = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.B = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.C = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.D = 0;
        dVar.E = 0.5f;
        dVar.F = 0.5f;
        dVar.G = null;
        dVar.H = -1.0f;
        dVar.I = -1.0f;
        dVar.J = 0;
        dVar.K = 0;
        dVar.L = 0;
        dVar.M = 0;
        dVar.N = 0;
        dVar.O = 0;
        dVar.P = 0;
        dVar.Q = 0;
        dVar.R = 1.0f;
        dVar.S = 1.0f;
        dVar.T = -1;
        dVar.U = -1;
        dVar.V = -1;
        dVar.W = false;
        dVar.X = false;
        dVar.Y = null;
        dVar.Z = 0;
        dVar.f30777a0 = true;
        dVar.f30779b0 = true;
        dVar.f30781c0 = false;
        dVar.f30783d0 = false;
        dVar.f30785e0 = false;
        dVar.f30787f0 = -1;
        dVar.f30789g0 = -1;
        dVar.h0 = -1;
        dVar.f30791i0 = -1;
        dVar.f30793j0 = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.f30795k0 = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.f30797l0 = 0.5f;
        dVar.f30804p0 = new m1.d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f30918b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i10 = c.f30775a.get(index);
            switch (i10) {
                case 1:
                    dVar.V = typedArrayObtainStyledAttributes.getInt(index, dVar.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f30803p);
                    dVar.f30803p = resourceId;
                    if (resourceId == -1) {
                        dVar.f30803p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    dVar.f30805q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f30805q);
                    break;
                case 4:
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, dVar.f30806r) % 360.0f;
                    dVar.f30806r = f10;
                    if (f10 < 0.0f) {
                        dVar.f30806r = (360.0f - f10) % 360.0f;
                    }
                    break;
                case 5:
                    dVar.f30776a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.f30776a);
                    break;
                case 6:
                    dVar.f30778b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.f30778b);
                    break;
                case 7:
                    dVar.f30780c = typedArrayObtainStyledAttributes.getFloat(index, dVar.f30780c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f30784e);
                    dVar.f30784e = resourceId2;
                    if (resourceId2 == -1) {
                        dVar.f30784e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f30786f);
                    dVar.f30786f = resourceId3;
                    if (resourceId3 == -1) {
                        dVar.f30786f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f30788g);
                    dVar.f30788g = resourceId4;
                    if (resourceId4 == -1) {
                        dVar.f30788g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f30790h);
                    dVar.f30790h = resourceId5;
                    if (resourceId5 == -1) {
                        dVar.f30790h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.i);
                    dVar.i = resourceId6;
                    if (resourceId6 == -1) {
                        dVar.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f30792j);
                    dVar.f30792j = resourceId7;
                    if (resourceId7 == -1) {
                        dVar.f30792j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f30794k);
                    dVar.f30794k = resourceId8;
                    if (resourceId8 == -1) {
                        dVar.f30794k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f30796l);
                    dVar.f30796l = resourceId9;
                    if (resourceId9 == -1) {
                        dVar.f30796l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f30798m);
                    dVar.f30798m = resourceId10;
                    if (resourceId10 == -1) {
                        dVar.f30798m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f30807s);
                    dVar.f30807s = resourceId11;
                    if (resourceId11 == -1) {
                        dVar.f30807s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f30808t);
                    dVar.f30808t = resourceId12;
                    if (resourceId12 == -1) {
                        dVar.f30808t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f30809u);
                    dVar.f30809u = resourceId13;
                    if (resourceId13 == -1) {
                        dVar.f30809u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f30810v);
                    dVar.f30810v = resourceId14;
                    if (resourceId14 == -1) {
                        dVar.f30810v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    dVar.f30811w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f30811w);
                    break;
                case 22:
                    dVar.f30812x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f30812x);
                    break;
                case 23:
                    dVar.f30813y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f30813y);
                    break;
                case 24:
                    dVar.f30814z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f30814z);
                    break;
                case 25:
                    dVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.A);
                    break;
                case 26:
                    dVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.B);
                    break;
                case 27:
                    dVar.W = typedArrayObtainStyledAttributes.getBoolean(index, dVar.W);
                    break;
                case 28:
                    dVar.X = typedArrayObtainStyledAttributes.getBoolean(index, dVar.X);
                    break;
                case 29:
                    dVar.E = typedArrayObtainStyledAttributes.getFloat(index, dVar.E);
                    break;
                case 30:
                    dVar.F = typedArrayObtainStyledAttributes.getFloat(index, dVar.F);
                    break;
                case 31:
                    int i11 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    dVar.L = i11;
                    if (i11 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    dVar.M = i12;
                    if (i12 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        dVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.N) == -2) {
                            dVar.N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        dVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.P) == -2) {
                            dVar.P = -2;
                        }
                    }
                    break;
                case 35:
                    dVar.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, dVar.R));
                    dVar.L = 2;
                    break;
                case 36:
                    try {
                        dVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.O) == -2) {
                            dVar.O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        dVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.Q) == -2) {
                            dVar.Q = -2;
                        }
                    }
                    break;
                case 38:
                    dVar.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, dVar.S));
                    dVar.M = 2;
                    break;
                default:
                    switch (i10) {
                        case 44:
                            m.h(dVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            dVar.H = typedArrayObtainStyledAttributes.getFloat(index, dVar.H);
                            break;
                        case 46:
                            dVar.I = typedArrayObtainStyledAttributes.getFloat(index, dVar.I);
                            break;
                        case 47:
                            dVar.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            dVar.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            dVar.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.T);
                            break;
                        case 50:
                            dVar.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.U);
                            break;
                        case 51:
                            dVar.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f30800n);
                            dVar.f30800n = resourceId15;
                            if (resourceId15 == -1) {
                                dVar.f30800n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f30802o);
                            dVar.f30802o = resourceId16;
                            if (resourceId16 == -1) {
                                dVar.f30802o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            dVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.D);
                            break;
                        case 55:
                            dVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.C);
                            break;
                        default:
                            switch (i10) {
                                case 64:
                                    m.g(dVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    m.g(dVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    dVar.Z = typedArrayObtainStyledAttributes.getInt(index, dVar.Z);
                                    break;
                                case 67:
                                    dVar.f30782d = typedArrayObtainStyledAttributes.getBoolean(index, dVar.f30782d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        dVar.a();
        return dVar;
    }

    public int getMaxHeight() {
        return this.f1283h;
    }

    public int getMaxWidth() {
        return this.f1282g;
    }

    public int getMinHeight() {
        return this.f1281f;
    }

    public int getMinWidth() {
        return this.f1280e;
    }

    public int getOptimizationLevel() {
        return this.f1279d.D0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        e eVar = this.f1279d;
        if (eVar.f28466j == null) {
            int id3 = getId();
            if (id3 != -1) {
                eVar.f28466j = getContext().getResources().getResourceEntryName(id3);
            } else {
                eVar.f28466j = "parent";
            }
        }
        if (eVar.h0 == null) {
            eVar.h0 = eVar.f28466j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.h0);
        }
        for (m1.d dVar : eVar.f28489q0) {
            View view = dVar.f28461f0;
            if (view != null) {
                if (dVar.f28466j == null && (id2 = view.getId()) != -1) {
                    dVar.f28466j = getContext().getResources().getResourceEntryName(id2);
                }
                if (dVar.h0 == null) {
                    dVar.h0 = dVar.f28466j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.h0);
                }
            }
        }
        eVar.n(sb2);
        return sb2.toString();
    }

    public final m1.d h(View view) {
        if (view == this) {
            return this.f1279d;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof d) {
            return ((d) view.getLayoutParams()).f30804p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof d) {
            return ((d) view.getLayoutParams()).f30804p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        e eVar = this.f1279d;
        eVar.f28461f0 = this;
        p1.e eVar2 = this.f1290p;
        eVar.f28493u0 = eVar2;
        eVar.f28491s0.f27943f = eVar2;
        this.f1277b.put(getId(), this);
        this.f1285k = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f30918b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 16) {
                    this.f1280e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1280e);
                } else if (index == 17) {
                    this.f1281f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1281f);
                } else if (index == 14) {
                    this.f1282g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1282g);
                } else if (index == 15) {
                    this.f1283h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1283h);
                } else if (index == 113) {
                    this.f1284j = typedArrayObtainStyledAttributes.getInt(index, this.f1284j);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1286l = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        m mVar = new m();
                        this.f1285k = mVar;
                        mVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1285k = null;
                    }
                    this.f1287m = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        eVar.D0 = this.f1284j;
        k1.c.f26800q = eVar.W(512);
    }

    public final void j(int i) {
        String str;
        Context context = getContext();
        i iVar = new i(18);
        iVar.f27978c = new SparseArray();
        iVar.f27979d = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                iVar.i(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                a aVar2 = new a(context, xml);
                                ((SparseArray) iVar.f27978c).put(aVar2.f1987b, aVar2);
                                aVar = aVar2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                f fVar = new f(context, xml);
                                if (aVar != null) {
                                    ((ArrayList) aVar.f1989d).add(fVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e3) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e3);
        } catch (XmlPullParserException e7) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e7);
        }
        this.f1286l = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x036e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(m1.e r28, int r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 1765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(m1.e, int, int, int):void");
    }

    public final void l(m1.d dVar, d dVar2, SparseArray sparseArray, int i, int i10) {
        View view = (View) this.f1277b.get(i);
        m1.d dVar3 = (m1.d) sparseArray.get(i);
        if (dVar3 == null || view == null || !(view.getLayoutParams() instanceof d)) {
            return;
        }
        dVar2.f30781c0 = true;
        if (i10 == 6) {
            d dVar4 = (d) view.getLayoutParams();
            dVar4.f30781c0 = true;
            dVar4.f30804p0.E = true;
        }
        dVar.i(6).b(dVar3.i(i10), dVar2.D, dVar2.C, true);
        dVar.E = true;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            d dVar = (d) childAt.getLayoutParams();
            m1.d dVar2 = dVar.f30804p0;
            if (childAt.getVisibility() != 8 || dVar.f30783d0 || dVar.f30785e0 || zIsInEditMode) {
                int iR = dVar2.r();
                int iS = dVar2.s();
                childAt.layout(iR, iS, dVar2.q() + iR, dVar2.k() + iS);
            }
        }
        ArrayList arrayList = this.f1278c;
        int size = arrayList.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                ((b) arrayList.get(i14)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0552  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 1559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        m1.d dVarH = h(view);
        if ((view instanceof o) && !(dVarH instanceof h)) {
            d dVar = (d) view.getLayoutParams();
            h hVar = new h();
            dVar.f30804p0 = hVar;
            dVar.f30783d0 = true;
            hVar.S(dVar.V);
        }
        if (view instanceof b) {
            b bVar = (b) view;
            bVar.i();
            ((d) view.getLayoutParams()).f30785e0 = true;
            ArrayList arrayList = this.f1278c;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        this.f1277b.put(view.getId(), view);
        this.i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1277b.remove(view.getId());
        m1.d dVarH = h(view);
        this.f1279d.f28489q0.remove(dVarH);
        dVarH.C();
        this.f1278c.remove(view);
        this.i = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.i = true;
        super.requestLayout();
    }

    public void setConstraintSet(m mVar) {
        this.f1285k = mVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id2 = getId();
        SparseArray sparseArray = this.f1277b;
        sparseArray.remove(id2);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f1283h) {
            return;
        }
        this.f1283h = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f1282g) {
            return;
        }
        this.f1282g = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f1281f) {
            return;
        }
        this.f1281f = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f1280e) {
            return;
        }
        this.f1280e = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(n nVar) {
        i iVar = this.f1286l;
        if (iVar != null) {
            iVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f1284j = i;
        e eVar = this.f1279d;
        eVar.D0 = i;
        k1.c.f26800q = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1277b = new SparseArray();
        this.f1278c = new ArrayList(4);
        this.f1279d = new e();
        this.f1280e = 0;
        this.f1281f = 0;
        this.f1282g = Integer.MAX_VALUE;
        this.f1283h = Integer.MAX_VALUE;
        this.i = true;
        this.f1284j = 257;
        this.f1285k = null;
        this.f1286l = null;
        this.f1287m = -1;
        this.f1288n = new HashMap();
        this.f1289o = new SparseArray();
        this.f1290p = new p1.e(this, this);
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        d dVar = new d(layoutParams);
        dVar.f30776a = -1;
        dVar.f30778b = -1;
        dVar.f30780c = -1.0f;
        dVar.f30782d = true;
        dVar.f30784e = -1;
        dVar.f30786f = -1;
        dVar.f30788g = -1;
        dVar.f30790h = -1;
        dVar.i = -1;
        dVar.f30792j = -1;
        dVar.f30794k = -1;
        dVar.f30796l = -1;
        dVar.f30798m = -1;
        dVar.f30800n = -1;
        dVar.f30802o = -1;
        dVar.f30803p = -1;
        dVar.f30805q = 0;
        dVar.f30806r = 0.0f;
        dVar.f30807s = -1;
        dVar.f30808t = -1;
        dVar.f30809u = -1;
        dVar.f30810v = -1;
        dVar.f30811w = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.f30812x = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.f30813y = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.f30814z = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.A = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.B = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.C = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.D = 0;
        dVar.E = 0.5f;
        dVar.F = 0.5f;
        dVar.G = null;
        dVar.H = -1.0f;
        dVar.I = -1.0f;
        dVar.J = 0;
        dVar.K = 0;
        dVar.L = 0;
        dVar.M = 0;
        dVar.N = 0;
        dVar.O = 0;
        dVar.P = 0;
        dVar.Q = 0;
        dVar.R = 1.0f;
        dVar.S = 1.0f;
        dVar.T = -1;
        dVar.U = -1;
        dVar.V = -1;
        dVar.W = false;
        dVar.X = false;
        dVar.Y = null;
        dVar.Z = 0;
        dVar.f30777a0 = true;
        dVar.f30779b0 = true;
        dVar.f30781c0 = false;
        dVar.f30783d0 = false;
        dVar.f30785e0 = false;
        dVar.f30787f0 = -1;
        dVar.f30789g0 = -1;
        dVar.h0 = -1;
        dVar.f30791i0 = -1;
        dVar.f30793j0 = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.f30795k0 = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        dVar.f30797l0 = 0.5f;
        dVar.f30804p0 = new m1.d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) dVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) dVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) dVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = marginLayoutParams.bottomMargin;
            dVar.setMarginStart(marginLayoutParams.getMarginStart());
            dVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof d)) {
            return dVar;
        }
        d dVar2 = (d) layoutParams;
        dVar.f30776a = dVar2.f30776a;
        dVar.f30778b = dVar2.f30778b;
        dVar.f30780c = dVar2.f30780c;
        dVar.f30782d = dVar2.f30782d;
        dVar.f30784e = dVar2.f30784e;
        dVar.f30786f = dVar2.f30786f;
        dVar.f30788g = dVar2.f30788g;
        dVar.f30790h = dVar2.f30790h;
        dVar.i = dVar2.i;
        dVar.f30792j = dVar2.f30792j;
        dVar.f30794k = dVar2.f30794k;
        dVar.f30796l = dVar2.f30796l;
        dVar.f30798m = dVar2.f30798m;
        dVar.f30800n = dVar2.f30800n;
        dVar.f30802o = dVar2.f30802o;
        dVar.f30803p = dVar2.f30803p;
        dVar.f30805q = dVar2.f30805q;
        dVar.f30806r = dVar2.f30806r;
        dVar.f30807s = dVar2.f30807s;
        dVar.f30808t = dVar2.f30808t;
        dVar.f30809u = dVar2.f30809u;
        dVar.f30810v = dVar2.f30810v;
        dVar.f30811w = dVar2.f30811w;
        dVar.f30812x = dVar2.f30812x;
        dVar.f30813y = dVar2.f30813y;
        dVar.f30814z = dVar2.f30814z;
        dVar.A = dVar2.A;
        dVar.B = dVar2.B;
        dVar.C = dVar2.C;
        dVar.D = dVar2.D;
        dVar.E = dVar2.E;
        dVar.F = dVar2.F;
        dVar.G = dVar2.G;
        dVar.H = dVar2.H;
        dVar.I = dVar2.I;
        dVar.J = dVar2.J;
        dVar.K = dVar2.K;
        dVar.W = dVar2.W;
        dVar.X = dVar2.X;
        dVar.L = dVar2.L;
        dVar.M = dVar2.M;
        dVar.N = dVar2.N;
        dVar.P = dVar2.P;
        dVar.O = dVar2.O;
        dVar.Q = dVar2.Q;
        dVar.R = dVar2.R;
        dVar.S = dVar2.S;
        dVar.T = dVar2.T;
        dVar.U = dVar2.U;
        dVar.V = dVar2.V;
        dVar.f30777a0 = dVar2.f30777a0;
        dVar.f30779b0 = dVar2.f30779b0;
        dVar.f30781c0 = dVar2.f30781c0;
        dVar.f30783d0 = dVar2.f30783d0;
        dVar.f30787f0 = dVar2.f30787f0;
        dVar.f30789g0 = dVar2.f30789g0;
        dVar.h0 = dVar2.h0;
        dVar.f30791i0 = dVar2.f30791i0;
        dVar.f30793j0 = dVar2.f30793j0;
        dVar.f30795k0 = dVar2.f30795k0;
        dVar.f30797l0 = dVar2.f30797l0;
        dVar.Y = dVar2.Y;
        dVar.Z = dVar2.Z;
        dVar.f30804p0 = dVar2.f30804p0;
        return dVar;
    }
}
