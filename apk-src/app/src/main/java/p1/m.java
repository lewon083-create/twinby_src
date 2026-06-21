package p1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.ads.om1;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f30910d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f30911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f30912f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f30913a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f30914b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f30915c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30911e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f30912f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(StringUtils.COMMA);
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i10 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = p.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f1288n;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f1288n.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i10] = iIntValue;
            i++;
            i10++;
        }
        return i10 != strArrSplit.length ? Arrays.copyOf(iArr, i10) : iArr;
    }

    public static h d(Context context, AttributeSet attributeSet, boolean z5) {
        int i;
        int i10;
        h hVar = new h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5 ? q.f30919c : q.f30917a);
        k kVar = hVar.f30840b;
        l lVar = hVar.f30843e;
        j jVar = hVar.f30841c;
        i iVar = hVar.f30842d;
        int[] iArr = f30910d;
        String[] strArr = l1.a.f27747a;
        SparseIntArray sparseIntArray = f30911e;
        if (z5) {
            g gVar = new g();
            gVar.f30828a = new int[10];
            gVar.f30829b = new int[10];
            gVar.f30830c = 0;
            gVar.f30831d = new int[10];
            gVar.f30832e = new float[10];
            gVar.f30833f = 0;
            gVar.f30834g = new int[5];
            gVar.f30835h = new String[5];
            gVar.i = 0;
            gVar.f30836j = new int[4];
            gVar.f30837k = new boolean[4];
            gVar.f30838l = 0;
            jVar.getClass();
            iVar.getClass();
            lVar.getClass();
            int i11 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i11 < indexCount; indexCount = i10) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                int i12 = i11;
                switch (f30912f.get(index)) {
                    case 2:
                        i10 = indexCount;
                        gVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.I));
                        continue;
                        i11 = i12 + 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i10 = indexCount;
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 5:
                        i10 = indexCount;
                        gVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i11 = i12 + 1;
                        break;
                    case 6:
                        i10 = indexCount;
                        gVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.C));
                        break;
                    case 7:
                        i10 = indexCount;
                        gVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.D));
                        break;
                    case 8:
                        i10 = indexCount;
                        gVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.J));
                        break;
                    case 11:
                        i10 = indexCount;
                        gVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.P));
                        break;
                    case 12:
                        i10 = indexCount;
                        gVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.Q));
                        break;
                    case 13:
                        i10 = indexCount;
                        gVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.M));
                        break;
                    case 14:
                        i10 = indexCount;
                        gVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.O));
                        break;
                    case 15:
                        i10 = indexCount;
                        gVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.R));
                        break;
                    case 16:
                        i10 = indexCount;
                        gVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.N));
                        break;
                    case 17:
                        i10 = indexCount;
                        gVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.f30852d));
                        break;
                    case 18:
                        i10 = indexCount;
                        gVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.f30854e));
                        break;
                    case 19:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, iVar.f30856f), 19);
                        break;
                    case 20:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, iVar.f30880w), 20);
                        break;
                    case 21:
                        i10 = indexCount;
                        gVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, iVar.f30850c));
                        break;
                    case 22:
                        i10 = indexCount;
                        gVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, kVar.f30893a)]);
                        break;
                    case 23:
                        i10 = indexCount;
                        gVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, iVar.f30848b));
                        break;
                    case 24:
                        i10 = indexCount;
                        gVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.F));
                        break;
                    case 27:
                        i10 = indexCount;
                        gVar.b(27, typedArrayObtainStyledAttributes.getInt(index, iVar.E));
                        break;
                    case 28:
                        i10 = indexCount;
                        gVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.G));
                        break;
                    case 31:
                        i10 = indexCount;
                        gVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.K));
                        break;
                    case 34:
                        i10 = indexCount;
                        gVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.H));
                        break;
                    case 37:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, iVar.f30881x), 37);
                        break;
                    case 38:
                        i10 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, hVar.f30839a);
                        hVar.f30839a = resourceId;
                        gVar.b(38, resourceId);
                        break;
                    case 39:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, iVar.U), 39);
                        break;
                    case 40:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, iVar.T), 40);
                        break;
                    case 41:
                        i10 = indexCount;
                        gVar.b(41, typedArrayObtainStyledAttributes.getInt(index, iVar.V));
                        break;
                    case 42:
                        i10 = indexCount;
                        gVar.b(42, typedArrayObtainStyledAttributes.getInt(index, iVar.W));
                        break;
                    case 43:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.f30895c), 43);
                        break;
                    case 44:
                        i10 = indexCount;
                        gVar.d(44, true);
                        gVar.a(typedArrayObtainStyledAttributes.getDimension(index, lVar.f30909m), 44);
                        break;
                    case 45:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, lVar.f30899b), 45);
                        break;
                    case 46:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, lVar.f30900c), 46);
                        break;
                    case 47:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, lVar.f30901d), 47);
                        break;
                    case 48:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, lVar.f30902e), 48);
                        break;
                    case 49:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getDimension(index, lVar.f30903f), 49);
                        break;
                    case 50:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getDimension(index, lVar.f30904g), 50);
                        break;
                    case 51:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getDimension(index, lVar.i), 51);
                        break;
                    case 52:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getDimension(index, lVar.f30906j), 52);
                        break;
                    case 53:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getDimension(index, lVar.f30907k), 53);
                        break;
                    case 54:
                        i10 = indexCount;
                        gVar.b(54, typedArrayObtainStyledAttributes.getInt(index, iVar.X));
                        break;
                    case 55:
                        i10 = indexCount;
                        gVar.b(55, typedArrayObtainStyledAttributes.getInt(index, iVar.Y));
                        break;
                    case 56:
                        i10 = indexCount;
                        gVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.Z));
                        break;
                    case 57:
                        i10 = indexCount;
                        gVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f30847a0));
                        break;
                    case 58:
                        i10 = indexCount;
                        gVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f30849b0));
                        break;
                    case 59:
                        i10 = indexCount;
                        gVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f30851c0));
                        break;
                    case 60:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, lVar.f30898a), 60);
                        break;
                    case 62:
                        i10 = indexCount;
                        gVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.A));
                        break;
                    case 63:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, iVar.B), 63);
                        break;
                    case 64:
                        i10 = indexCount;
                        gVar.b(64, f(typedArrayObtainStyledAttributes, index, jVar.f30885a));
                        break;
                    case 65:
                        i10 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            gVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            gVar.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i10 = indexCount;
                        gVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, jVar.f30889e), 67);
                        break;
                    case 68:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.f30896d), 68);
                        break;
                    case 69:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        i10 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i10 = indexCount;
                        gVar.b(72, typedArrayObtainStyledAttributes.getInt(index, iVar.f30857f0));
                        break;
                    case 73:
                        i10 = indexCount;
                        gVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f30859g0));
                        break;
                    case 74:
                        i10 = indexCount;
                        gVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i10 = indexCount;
                        gVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, iVar.f30871n0));
                        break;
                    case 76:
                        i10 = indexCount;
                        gVar.b(76, typedArrayObtainStyledAttributes.getInt(index, jVar.f30887c));
                        break;
                    case 77:
                        i10 = indexCount;
                        gVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i10 = indexCount;
                        gVar.b(78, typedArrayObtainStyledAttributes.getInt(index, kVar.f30894b));
                        break;
                    case 79:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, jVar.f30888d), 79);
                        break;
                    case 80:
                        i10 = indexCount;
                        gVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, iVar.f30867l0));
                        break;
                    case 81:
                        i10 = indexCount;
                        gVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, iVar.f30869m0));
                        break;
                    case 82:
                        i10 = indexCount;
                        gVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, jVar.f30886b));
                        break;
                    case 83:
                        i10 = indexCount;
                        gVar.b(83, f(typedArrayObtainStyledAttributes, index, lVar.f30905h));
                        break;
                    case 84:
                        i10 = indexCount;
                        gVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, jVar.f30891g));
                        break;
                    case 85:
                        i10 = indexCount;
                        gVar.a(typedArrayObtainStyledAttributes.getFloat(index, jVar.f30890f), 85);
                        break;
                    case 86:
                        i10 = indexCount;
                        int i13 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i13 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            jVar.i = resourceId2;
                            gVar.b(89, resourceId2);
                            if (jVar.i != -1) {
                                gVar.b(88, -2);
                            }
                        } else if (i13 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            jVar.f30892h = string;
                            gVar.c(90, string);
                            if (jVar.f30892h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                jVar.i = resourceId3;
                                gVar.b(89, resourceId3);
                                gVar.b(88, -2);
                            } else {
                                gVar.b(88, -1);
                            }
                        } else {
                            gVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, jVar.i));
                        }
                        break;
                    case 87:
                        i10 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i10 = indexCount;
                        gVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.L));
                        break;
                    case 94:
                        i10 = indexCount;
                        gVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.S));
                        break;
                    case 95:
                        i10 = indexCount;
                        g(gVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i10 = indexCount;
                        g(gVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i10 = indexCount;
                        gVar.b(97, typedArrayObtainStyledAttributes.getInt(index, iVar.o0));
                        break;
                    case 98:
                        i10 = indexCount;
                        int i14 = o1.a.f29597r;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            hVar.f30839a = typedArrayObtainStyledAttributes.getResourceId(index, hVar.f30839a);
                        }
                        break;
                    case 99:
                        i10 = indexCount;
                        gVar.d(99, typedArrayObtainStyledAttributes.getBoolean(index, iVar.f30858g));
                        break;
                }
                i11 = i12 + 1;
            }
        } else {
            int i15 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i15 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i15);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        jVar.getClass();
                        iVar.getClass();
                        lVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        iVar.f30873p = f(typedArrayObtainStyledAttributes, index2, iVar.f30873p);
                        continue;
                        i15++;
                        break;
                    case 2:
                        i = indexCount2;
                        iVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.I);
                        continue;
                        i15++;
                        break;
                    case 3:
                        i = indexCount2;
                        iVar.f30872o = f(typedArrayObtainStyledAttributes, index2, iVar.f30872o);
                        continue;
                        i15++;
                        break;
                    case 4:
                        i = indexCount2;
                        iVar.f30870n = f(typedArrayObtainStyledAttributes, index2, iVar.f30870n);
                        continue;
                        i15++;
                        break;
                    case 5:
                        i = indexCount2;
                        iVar.f30882y = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i15++;
                        break;
                    case 6:
                        i = indexCount2;
                        iVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, iVar.C);
                        continue;
                        i15++;
                        break;
                    case 7:
                        i = indexCount2;
                        iVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, iVar.D);
                        continue;
                        i15++;
                        break;
                    case 8:
                        i = indexCount2;
                        iVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.J);
                        continue;
                        i15++;
                        break;
                    case 9:
                        i = indexCount2;
                        iVar.f30879v = f(typedArrayObtainStyledAttributes, index2, iVar.f30879v);
                        continue;
                        i15++;
                        break;
                    case 10:
                        i = indexCount2;
                        iVar.f30878u = f(typedArrayObtainStyledAttributes, index2, iVar.f30878u);
                        continue;
                        i15++;
                        break;
                    case 11:
                        i = indexCount2;
                        iVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.P);
                        continue;
                        i15++;
                        break;
                    case 12:
                        i = indexCount2;
                        iVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.Q);
                        continue;
                        i15++;
                        break;
                    case 13:
                        i = indexCount2;
                        iVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.M);
                        continue;
                        i15++;
                        break;
                    case 14:
                        i = indexCount2;
                        iVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.O);
                        continue;
                        i15++;
                        break;
                    case 15:
                        i = indexCount2;
                        iVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.R);
                        continue;
                        i15++;
                        break;
                    case 16:
                        i = indexCount2;
                        iVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.N);
                        continue;
                        i15++;
                        break;
                    case 17:
                        i = indexCount2;
                        iVar.f30852d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, iVar.f30852d);
                        continue;
                        i15++;
                        break;
                    case 18:
                        i = indexCount2;
                        iVar.f30854e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, iVar.f30854e);
                        continue;
                        i15++;
                        break;
                    case 19:
                        i = indexCount2;
                        iVar.f30856f = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f30856f);
                        continue;
                        i15++;
                        break;
                    case 20:
                        i = indexCount2;
                        iVar.f30880w = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f30880w);
                        continue;
                        i15++;
                        break;
                    case 21:
                        i = indexCount2;
                        iVar.f30850c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, iVar.f30850c);
                        continue;
                        i15++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i16 = typedArrayObtainStyledAttributes.getInt(index2, kVar.f30893a);
                        kVar.f30893a = i16;
                        kVar.f30893a = iArr[i16];
                        continue;
                        i15++;
                        break;
                    case 23:
                        i = indexCount2;
                        iVar.f30848b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, iVar.f30848b);
                        continue;
                        i15++;
                        break;
                    case 24:
                        i = indexCount2;
                        iVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.F);
                        continue;
                        i15++;
                        break;
                    case 25:
                        i = indexCount2;
                        iVar.f30860h = f(typedArrayObtainStyledAttributes, index2, iVar.f30860h);
                        continue;
                        i15++;
                        break;
                    case 26:
                        i = indexCount2;
                        iVar.i = f(typedArrayObtainStyledAttributes, index2, iVar.i);
                        continue;
                        i15++;
                        break;
                    case 27:
                        i = indexCount2;
                        iVar.E = typedArrayObtainStyledAttributes.getInt(index2, iVar.E);
                        continue;
                        i15++;
                        break;
                    case 28:
                        i = indexCount2;
                        iVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.G);
                        continue;
                        i15++;
                        break;
                    case 29:
                        i = indexCount2;
                        iVar.f30862j = f(typedArrayObtainStyledAttributes, index2, iVar.f30862j);
                        continue;
                        i15++;
                        break;
                    case 30:
                        i = indexCount2;
                        iVar.f30864k = f(typedArrayObtainStyledAttributes, index2, iVar.f30864k);
                        continue;
                        i15++;
                        break;
                    case 31:
                        i = indexCount2;
                        iVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.K);
                        continue;
                        i15++;
                        break;
                    case 32:
                        i = indexCount2;
                        iVar.f30876s = f(typedArrayObtainStyledAttributes, index2, iVar.f30876s);
                        continue;
                        i15++;
                        break;
                    case 33:
                        i = indexCount2;
                        iVar.f30877t = f(typedArrayObtainStyledAttributes, index2, iVar.f30877t);
                        continue;
                        i15++;
                        break;
                    case 34:
                        i = indexCount2;
                        iVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.H);
                        continue;
                        i15++;
                        break;
                    case 35:
                        i = indexCount2;
                        iVar.f30868m = f(typedArrayObtainStyledAttributes, index2, iVar.f30868m);
                        continue;
                        i15++;
                        break;
                    case 36:
                        i = indexCount2;
                        iVar.f30866l = f(typedArrayObtainStyledAttributes, index2, iVar.f30866l);
                        continue;
                        i15++;
                        break;
                    case 37:
                        i = indexCount2;
                        iVar.f30881x = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f30881x);
                        continue;
                        i15++;
                        break;
                    case 38:
                        i = indexCount2;
                        hVar.f30839a = typedArrayObtainStyledAttributes.getResourceId(index2, hVar.f30839a);
                        continue;
                        i15++;
                        break;
                    case 39:
                        i = indexCount2;
                        iVar.U = typedArrayObtainStyledAttributes.getFloat(index2, iVar.U);
                        continue;
                        i15++;
                        break;
                    case 40:
                        i = indexCount2;
                        iVar.T = typedArrayObtainStyledAttributes.getFloat(index2, iVar.T);
                        continue;
                        i15++;
                        break;
                    case 41:
                        i = indexCount2;
                        iVar.V = typedArrayObtainStyledAttributes.getInt(index2, iVar.V);
                        continue;
                        i15++;
                        break;
                    case 42:
                        i = indexCount2;
                        iVar.W = typedArrayObtainStyledAttributes.getInt(index2, iVar.W);
                        continue;
                        i15++;
                        break;
                    case 43:
                        i = indexCount2;
                        kVar.f30895c = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f30895c);
                        continue;
                        i15++;
                        break;
                    case 44:
                        i = indexCount2;
                        lVar.f30908l = true;
                        lVar.f30909m = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f30909m);
                        continue;
                        i15++;
                        break;
                    case 45:
                        i = indexCount2;
                        lVar.f30899b = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f30899b);
                        continue;
                        i15++;
                        break;
                    case 46:
                        i = indexCount2;
                        lVar.f30900c = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f30900c);
                        continue;
                        i15++;
                        break;
                    case 47:
                        i = indexCount2;
                        lVar.f30901d = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f30901d);
                        continue;
                        i15++;
                        break;
                    case 48:
                        i = indexCount2;
                        lVar.f30902e = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f30902e);
                        continue;
                        i15++;
                        break;
                    case 49:
                        i = indexCount2;
                        lVar.f30903f = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f30903f);
                        continue;
                        i15++;
                        break;
                    case 50:
                        i = indexCount2;
                        lVar.f30904g = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f30904g);
                        continue;
                        i15++;
                        break;
                    case 51:
                        i = indexCount2;
                        lVar.i = typedArrayObtainStyledAttributes.getDimension(index2, lVar.i);
                        continue;
                        i15++;
                        break;
                    case 52:
                        i = indexCount2;
                        lVar.f30906j = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f30906j);
                        continue;
                        i15++;
                        break;
                    case 53:
                        i = indexCount2;
                        lVar.f30907k = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f30907k);
                        continue;
                        i15++;
                        break;
                    case 54:
                        i = indexCount2;
                        iVar.X = typedArrayObtainStyledAttributes.getInt(index2, iVar.X);
                        continue;
                        i15++;
                        break;
                    case 55:
                        i = indexCount2;
                        iVar.Y = typedArrayObtainStyledAttributes.getInt(index2, iVar.Y);
                        continue;
                        i15++;
                        break;
                    case 56:
                        i = indexCount2;
                        iVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.Z);
                        continue;
                        i15++;
                        break;
                    case 57:
                        i = indexCount2;
                        iVar.f30847a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f30847a0);
                        continue;
                        i15++;
                        break;
                    case 58:
                        i = indexCount2;
                        iVar.f30849b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f30849b0);
                        continue;
                        i15++;
                        break;
                    case 59:
                        i = indexCount2;
                        iVar.f30851c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f30851c0);
                        continue;
                        i15++;
                        break;
                    case 60:
                        i = indexCount2;
                        lVar.f30898a = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f30898a);
                        continue;
                        i15++;
                        break;
                    case 61:
                        i = indexCount2;
                        iVar.f30883z = f(typedArrayObtainStyledAttributes, index2, iVar.f30883z);
                        continue;
                        i15++;
                        break;
                    case 62:
                        i = indexCount2;
                        iVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.A);
                        continue;
                        i15++;
                        break;
                    case 63:
                        i = indexCount2;
                        iVar.B = typedArrayObtainStyledAttributes.getFloat(index2, iVar.B);
                        continue;
                        i15++;
                        break;
                    case 64:
                        i = indexCount2;
                        jVar.f30885a = f(typedArrayObtainStyledAttributes, index2, jVar.f30885a);
                        continue;
                        i15++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            jVar.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            jVar.getClass();
                            i15++;
                        }
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        jVar.getClass();
                        continue;
                        i15++;
                        break;
                    case 67:
                        i = indexCount2;
                        jVar.f30889e = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f30889e);
                        break;
                    case 68:
                        i = indexCount2;
                        kVar.f30896d = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f30896d);
                        break;
                    case 69:
                        i = indexCount2;
                        iVar.f30853d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        iVar.f30855e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        iVar.f30857f0 = typedArrayObtainStyledAttributes.getInt(index2, iVar.f30857f0);
                        break;
                    case 73:
                        i = indexCount2;
                        iVar.f30859g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f30859g0);
                        break;
                    case 74:
                        i = indexCount2;
                        iVar.f30863j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        iVar.f30871n0 = typedArrayObtainStyledAttributes.getBoolean(index2, iVar.f30871n0);
                        break;
                    case 76:
                        i = indexCount2;
                        jVar.f30887c = typedArrayObtainStyledAttributes.getInt(index2, jVar.f30887c);
                        break;
                    case 77:
                        i = indexCount2;
                        iVar.f30865k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        kVar.f30894b = typedArrayObtainStyledAttributes.getInt(index2, kVar.f30894b);
                        break;
                    case 79:
                        i = indexCount2;
                        jVar.f30888d = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f30888d);
                        break;
                    case 80:
                        i = indexCount2;
                        iVar.f30867l0 = typedArrayObtainStyledAttributes.getBoolean(index2, iVar.f30867l0);
                        break;
                    case 81:
                        i = indexCount2;
                        iVar.f30869m0 = typedArrayObtainStyledAttributes.getBoolean(index2, iVar.f30869m0);
                        break;
                    case 82:
                        i = indexCount2;
                        jVar.f30886b = typedArrayObtainStyledAttributes.getInteger(index2, jVar.f30886b);
                        break;
                    case 83:
                        i = indexCount2;
                        lVar.f30905h = f(typedArrayObtainStyledAttributes, index2, lVar.f30905h);
                        break;
                    case 84:
                        i = indexCount2;
                        jVar.f30891g = typedArrayObtainStyledAttributes.getInteger(index2, jVar.f30891g);
                        break;
                    case 85:
                        i = indexCount2;
                        jVar.f30890f = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f30890f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i17 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i17 == 1) {
                            jVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i17 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            jVar.f30892h = string2;
                            if (string2.indexOf("/") > 0) {
                                jVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, jVar.i);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb3 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb3.append(Integer.toHexString(index2));
                        sb3.append("   ");
                        sb3.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb3.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        iVar.f30874q = f(typedArrayObtainStyledAttributes, index2, iVar.f30874q);
                        break;
                    case 92:
                        i = indexCount2;
                        iVar.f30875r = f(typedArrayObtainStyledAttributes, index2, iVar.f30875r);
                        break;
                    case 93:
                        i = indexCount2;
                        iVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.L);
                        break;
                    case 94:
                        i = indexCount2;
                        iVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.S);
                        break;
                    case 95:
                        i = indexCount2;
                        g(iVar, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i15++;
                        break;
                    case 96:
                        i = indexCount2;
                        g(iVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        iVar.o0 = typedArrayObtainStyledAttributes.getInt(index2, iVar.o0);
                        break;
                }
                i15++;
            }
            if (iVar.f30863j0 != null) {
                iVar.f30861i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return hVar;
    }

    public static int f(TypedArray typedArray, int i, int i10) {
        int resourceId = typedArray.getResourceId(i, i10);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.m.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(d dVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            if (i == 1) {
                                Math.abs(f11 / f10);
                            } else {
                                Math.abs(f10 / f11);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        dVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap map;
        String resourceEntryName;
        m mVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = mVar.f30915c;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb2.append(resourceEntryName);
                Log.w("ConstraintSet", sb2.toString());
            } else {
                if (mVar.f30914b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (map2.containsKey(Integer.valueOf(id2))) {
                        hashSet2.remove(Integer.valueOf(id2));
                        h hVar = (h) map2.get(Integer.valueOf(id2));
                        if (hVar != null) {
                            k kVar = hVar.f30840b;
                            i iVar = hVar.f30842d;
                            l lVar = hVar.f30843e;
                            if (childAt instanceof Barrier) {
                                iVar.h0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(iVar.f30857f0);
                                barrier.setMargin(iVar.f30859g0);
                                barrier.setAllowsGoneWidget(iVar.f30871n0);
                                int[] iArr = iVar.f30861i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = iVar.f30863j0;
                                    if (str != null) {
                                        int[] iArrC = c(barrier, str);
                                        iVar.f30861i0 = iArrC;
                                        barrier.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            d dVar = (d) childAt.getLayoutParams();
                            dVar.a();
                            hVar.a(dVar);
                            HashMap map3 = hVar.f30844f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                a aVar = (a) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strK = !aVar.f30761a ? om1.k("set", str2) : str2;
                                int i11 = i10;
                                try {
                                    int iM = z.m(aVar.f30762b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iM) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strK, cls3).invoke(childAt, Integer.valueOf(aVar.f30763c));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strK, cls2).invoke(childAt, Float.valueOf(aVar.f30764d));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strK, cls3).invoke(childAt, Integer.valueOf(aVar.f30767g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strK, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(aVar.f30767g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e3) {
                                                e = e3;
                                                StringBuilder sbP = om1.p(" Custom Attribute \"", str2, "\" not found on ");
                                                sbP.append(cls.getName());
                                                Log.e("TransitionLayout", sbP.toString(), e);
                                            } catch (NoSuchMethodException e7) {
                                                e = e7;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strK, e);
                                            } catch (InvocationTargetException e10) {
                                                e = e10;
                                                StringBuilder sbP2 = om1.p(" Custom Attribute \"", str2, "\" not found on ");
                                                sbP2.append(cls.getName());
                                                Log.e("TransitionLayout", sbP2.toString(), e);
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(strK, CharSequence.class).invoke(childAt, aVar.f30765e);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strK, Boolean.TYPE).invoke(childAt, Boolean.valueOf(aVar.f30766f));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strK, cls2).invoke(childAt, Float.valueOf(aVar.f30764d));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strK, cls3).invoke(childAt, Integer.valueOf(aVar.f30763c));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e11) {
                                    e = e11;
                                    map = map3;
                                } catch (NoSuchMethodException e12) {
                                    e = e12;
                                    map = map3;
                                } catch (InvocationTargetException e13) {
                                    e = e13;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i10 = i11;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i = i10;
                            childAt.setLayoutParams(dVar);
                            if (kVar.f30894b == 0) {
                                childAt.setVisibility(kVar.f30893a);
                            }
                            childAt.setAlpha(kVar.f30895c);
                            childAt.setRotation(lVar.f30898a);
                            childAt.setRotationX(lVar.f30899b);
                            childAt.setRotationY(lVar.f30900c);
                            childAt.setScaleX(lVar.f30901d);
                            childAt.setScaleY(lVar.f30902e);
                            if (lVar.f30905h != -1) {
                                if (((View) childAt.getParent()).findViewById(lVar.f30905h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(lVar.f30903f)) {
                                    childAt.setPivotX(lVar.f30903f);
                                }
                                if (!Float.isNaN(lVar.f30904g)) {
                                    childAt.setPivotY(lVar.f30904g);
                                }
                            }
                            childAt.setTranslationX(lVar.i);
                            childAt.setTranslationY(lVar.f30906j);
                            childAt.setTranslationZ(lVar.f30907k);
                            if (lVar.f30908l) {
                                childAt.setElevation(lVar.f30909m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i10;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
                i10 = i + 1;
                mVar = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i10;
            i10 = i + 1;
            mVar = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            h hVar2 = (h) map2.get(num);
            if (hVar2 != null) {
                i iVar2 = hVar2.f30842d;
                if (iVar2.h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = iVar2.f30861i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str3 = iVar2.f30863j0;
                        if (str3 != null) {
                            int[] iArrC2 = c(barrier2, str3);
                            iVar2.f30861i0 = iArrC2;
                            barrier2.setReferencedIds(iArrC2);
                        }
                    }
                    barrier2.setType(iVar2.f30857f0);
                    barrier2.setMargin(iVar2.f30859g0);
                    d dVarG = ConstraintLayout.g();
                    barrier2.i();
                    hVar2.a(dVarG);
                    constraintLayout.addView(barrier2, dVarG);
                }
                if (iVar2.f30846a) {
                    View oVar = new o(constraintLayout.getContext());
                    oVar.setId(num.intValue());
                    d dVarG2 = ConstraintLayout.g();
                    hVar2.a(dVarG2);
                    constraintLayout.addView(oVar, dVarG2);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof b) {
                ((b) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        int i10;
        m mVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = mVar.f30915c;
        map2.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            d dVar = (d) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (mVar.f30914b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map2.containsKey(Integer.valueOf(id2))) {
                map2.put(Integer.valueOf(id2), new h());
            }
            h hVar = (h) map2.get(Integer.valueOf(id2));
            if (hVar == null) {
                i = childCount;
                map = map2;
                i10 = i11;
            } else {
                k kVar = hVar.f30840b;
                i iVar = hVar.f30842d;
                l lVar = hVar.f30843e;
                i = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i10 = i11;
                HashMap map4 = mVar.f30913a;
                for (String str : map4.keySet()) {
                    a aVar = (a) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e3) {
                        StringBuilder sbP = om1.p(" Custom Attribute \"", str, "\" not found on ");
                        sbP.append(cls.getName());
                        Log.e("TransitionLayout", sbP.toString(), e3);
                    } catch (NoSuchMethodException e7) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e7);
                    } catch (InvocationTargetException e10) {
                        StringBuilder sbP2 = om1.p(" Custom Attribute \"", str, "\" not found on ");
                        sbP2.append(cls.getName());
                        Log.e("TransitionLayout", sbP2.toString(), e10);
                    }
                    map4 = map5;
                }
                hVar.f30844f = map3;
                hVar.f30839a = id2;
                iVar.f30860h = dVar.f30784e;
                iVar.i = dVar.f30786f;
                iVar.f30862j = dVar.f30788g;
                iVar.f30864k = dVar.f30790h;
                iVar.f30866l = dVar.i;
                iVar.f30868m = dVar.f30792j;
                iVar.f30870n = dVar.f30794k;
                iVar.f30872o = dVar.f30796l;
                iVar.f30873p = dVar.f30798m;
                iVar.f30874q = dVar.f30800n;
                iVar.f30875r = dVar.f30802o;
                iVar.f30876s = dVar.f30807s;
                iVar.f30877t = dVar.f30808t;
                iVar.f30878u = dVar.f30809u;
                iVar.f30879v = dVar.f30810v;
                iVar.f30880w = dVar.E;
                iVar.f30881x = dVar.F;
                iVar.f30882y = dVar.G;
                iVar.f30883z = dVar.f30803p;
                iVar.A = dVar.f30805q;
                iVar.B = dVar.f30806r;
                iVar.C = dVar.T;
                iVar.D = dVar.U;
                iVar.E = dVar.V;
                iVar.f30856f = dVar.f30780c;
                iVar.f30852d = dVar.f30776a;
                iVar.f30854e = dVar.f30778b;
                iVar.f30848b = ((ViewGroup.MarginLayoutParams) dVar).width;
                iVar.f30850c = ((ViewGroup.MarginLayoutParams) dVar).height;
                iVar.F = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                iVar.G = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                iVar.H = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                iVar.I = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                iVar.L = dVar.D;
                iVar.T = dVar.I;
                iVar.U = dVar.H;
                iVar.W = dVar.K;
                iVar.V = dVar.J;
                iVar.f30867l0 = dVar.W;
                iVar.f30869m0 = dVar.X;
                iVar.X = dVar.L;
                iVar.Y = dVar.M;
                iVar.Z = dVar.P;
                iVar.f30847a0 = dVar.Q;
                iVar.f30849b0 = dVar.N;
                iVar.f30851c0 = dVar.O;
                iVar.f30853d0 = dVar.R;
                iVar.f30855e0 = dVar.S;
                iVar.f30865k0 = dVar.Y;
                iVar.N = dVar.f30812x;
                iVar.P = dVar.f30814z;
                iVar.M = dVar.f30811w;
                iVar.O = dVar.f30813y;
                iVar.R = dVar.A;
                iVar.Q = dVar.B;
                iVar.S = dVar.C;
                iVar.o0 = dVar.Z;
                iVar.J = dVar.getMarginEnd();
                iVar.K = dVar.getMarginStart();
                kVar.f30893a = childAt.getVisibility();
                kVar.f30895c = childAt.getAlpha();
                lVar.f30898a = childAt.getRotation();
                lVar.f30899b = childAt.getRotationX();
                lVar.f30900c = childAt.getRotationY();
                lVar.f30901d = childAt.getScaleX();
                lVar.f30902e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != ConfigValue.DOUBLE_DEFAULT_VALUE || pivotY != ConfigValue.DOUBLE_DEFAULT_VALUE) {
                    lVar.f30903f = pivotX;
                    lVar.f30904g = pivotY;
                }
                lVar.i = childAt.getTranslationX();
                lVar.f30906j = childAt.getTranslationY();
                lVar.f30907k = childAt.getTranslationZ();
                if (lVar.f30908l) {
                    lVar.f30909m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    iVar.f30871n0 = barrier.getAllowsGoneWidget();
                    iVar.f30861i0 = barrier.getReferencedIds();
                    iVar.f30857f0 = barrier.getType();
                    iVar.f30859g0 = barrier.getMargin();
                }
            }
            i11 = i10 + 1;
            mVar = this;
            childCount = i;
            map2 = map;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    h hVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        hVarD.f30842d.f30846a = true;
                    }
                    this.f30915c.put(Integer.valueOf(hVarD.f30839a), hVarD);
                }
            }
        } catch (IOException e3) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e3);
        } catch (XmlPullParserException e7) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e7);
        }
    }
}
