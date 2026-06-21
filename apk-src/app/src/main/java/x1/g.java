package x1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d4;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class g extends e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Class f35705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Constructor f35706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Method f35707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Method f35708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Method f35709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Method f35710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Method f35711q;

    public g() throws NoSuchMethodException {
        Method methodF0;
        Constructor<?> constructor;
        Method methodE0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodE0 = e0(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodF0 = f0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e3.getClass().getName()), e3);
            methodF0 = null;
            constructor = null;
            methodE0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f35705k = cls;
        this.f35706l = constructor;
        this.f35707m = methodE0;
        this.f35708n = method;
        this.f35709o = method2;
        this.f35710p = method3;
        this.f35711q = methodF0;
    }

    public static Method e0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean b0(Context context, Object obj, String str, int i, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f35707m.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface c0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f35705k, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f35711q.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean d0(Object obj) {
        try {
            return ((Boolean) this.f35709o.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method f0(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // x1.e, com.google.android.gms.internal.measurement.b4
    public final Typeface h(Context context, w1.e eVar, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f35707m;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.h(context, eVar, resources, i);
        }
        try {
            objNewInstance = this.f35706l.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            w1.f[] fVarArr = eVar.f34971a;
            int length = fVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    w1.f fVar = fVarArr[i10];
                    Context context2 = context;
                    if (b0(context2, objNewInstance, fVar.f34972a, fVar.f34976e, fVar.f34973b, fVar.f34974c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f34975d))) {
                        i10++;
                        context = context2;
                    } else {
                        try {
                            this.f35710p.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (d0(objNewInstance)) {
                    return c0(objNewInstance);
                }
            }
        }
        return null;
    }

    @Override // x1.e, com.google.android.gms.internal.measurement.b4
    public final Typeface i(Context context, d2.i[] iVarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceC0;
        boolean zBooleanValue;
        if (iVarArr.length >= 1) {
            Method method = this.f35707m;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (d2.i iVar : iVarArr) {
                        if (iVar.f15553f == 0) {
                            Uri uri = iVar.f15548a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, d4.q(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f35706l.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = iVarArr.length;
                        int i10 = 0;
                        boolean z5 = false;
                        while (true) {
                            Method method2 = this.f35710p;
                            if (i10 < length) {
                                d2.i iVar2 = iVarArr[i10];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(iVar2.f15548a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f35708n.invoke(objNewInstance, byteBuffer, Integer.valueOf(iVar2.f15549b), null, Integer.valueOf(iVar2.f15550c), Integer.valueOf(iVar2.f15551d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z5 = true;
                                }
                                i10++;
                                z5 = z5;
                            } else if (!z5) {
                                method2.invoke(objNewInstance, null);
                            } else if (d0(objNewInstance) && (typefaceC0 = c0(objNewInstance)) != null) {
                                return Typeface.create(typefaceC0, i);
                            }
                        }
                    }
                } else {
                    d2.i iVarP = b4.p(iVarArr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(iVarP.f15548a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(iVarP.f15550c).setItalic(iVarP.f15551d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final Typeface k(Context context, Resources resources, int i, String str, int i10) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f35707m;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.k(context, resources, i, str, i10);
        }
        try {
            objNewInstance = this.f35706l.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!b0(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f35710p.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (d0(objNewInstance)) {
                return c0(objNewInstance);
            }
        }
        return null;
    }
}
