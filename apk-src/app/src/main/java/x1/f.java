package x1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class f35702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Constructor f35703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Method f35704h;
    public static final Method i;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi24Impl", e3.getClass().getName(), e3);
            cls = null;
            method = null;
            method2 = null;
        }
        f35703g = constructor;
        f35702f = cls;
        f35704h = method2;
        i = method;
    }

    public static boolean Z(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z5) {
        try {
            return ((Boolean) f35704h.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface a0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f35702f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) i.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final Typeface h(Context context, w1.e eVar, Resources resources, int i10) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f35703g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (w1.f fVar : eVar.f34971a) {
                int i11 = fVar.f34977f;
                File fileK = d4.k(context);
                if (fileK != null) {
                    try {
                        if (d4.a(fileK, resources, i11)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileK);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                } finally {
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                            if (map != null && Z(objNewInstance, map, fVar.f34976e, fVar.f34973b, fVar.f34974c)) {
                            }
                        }
                    } finally {
                        fileK.delete();
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return a0(objNewInstance);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final Typeface i(Context context, d2.i[] iVarArr, int i10) {
        Object objNewInstance;
        try {
            objNewInstance = f35703g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int i11 = 0;
            h1.i iVar = new h1.i(0);
            int length = iVarArr.length;
            while (true) {
                if (i11 < length) {
                    d2.i iVar2 = iVarArr[i11];
                    Uri uri = iVar2.f15548a;
                    ByteBuffer byteBufferQ = (ByteBuffer) iVar.get(uri);
                    if (byteBufferQ == null) {
                        byteBufferQ = d4.q(context, uri);
                        iVar.put(uri, byteBufferQ);
                    }
                    if (byteBufferQ == null || !Z(objNewInstance, byteBufferQ, iVar2.f15549b, iVar2.f15550c, iVar2.f15551d)) {
                        break;
                    }
                    i11++;
                } else {
                    Typeface typefaceA0 = a0(objNewInstance);
                    if (typefaceA0 != null) {
                        return Typeface.create(typefaceA0, i10);
                    }
                }
            }
        }
        return null;
    }
}
