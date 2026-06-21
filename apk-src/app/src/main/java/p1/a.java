package p1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f30761a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f30764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f30765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30767g;

    public a(a aVar, Object obj) {
        aVar.getClass();
        this.f30762b = aVar.f30762b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f30920d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i = 0;
        boolean z5 = false;
        Object objValueOf = null;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            int i11 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z5 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i12 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i12 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i12 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i11 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i11;
                            }
                        }
                        i = 7;
                    }
                }
                i = i12;
            }
        }
        if (string != null && objValueOf != null) {
            a aVar = new a();
            aVar.f30762b = i;
            aVar.f30761a = z5;
            aVar.b(objValueOf);
            map.put(string, aVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (z.m(this.f30762b)) {
            case 0:
            case 7:
                this.f30763c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f30764d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f30767g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f30765e = (String) obj;
                break;
            case 5:
                this.f30766f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f30764d = ((Float) obj).floatValue();
                break;
        }
    }
}
