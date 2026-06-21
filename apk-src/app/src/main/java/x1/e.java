package x1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
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

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class e extends b4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Class f35698f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Constructor f35699g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Method f35700h = null;
    public static Method i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f35701j = false;

    public static boolean Z(String str, boolean z5, int i10, Object obj) throws NoSuchMethodException {
        a0();
        try {
            return ((Boolean) f35700h.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void a0() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f35701j) {
            return;
        }
        f35701j = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi21Impl", e3.getClass().getName(), e3);
            method = null;
            cls = null;
            method2 = null;
        }
        f35699g = constructor;
        f35698f = cls;
        f35700h = method2;
        i = method;
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public Typeface h(Context context, w1.e eVar, Resources resources, int i10) throws NoSuchMethodException {
        a0();
        try {
            Object objNewInstance = f35699g.newInstance(null);
            for (w1.f fVar : eVar.f34971a) {
                File fileK = d4.k(context);
                if (fileK == null) {
                    return null;
                }
                try {
                    if (!d4.a(fileK, resources, fVar.f34977f)) {
                        return null;
                    }
                    if (!Z(fileK.getPath(), fVar.f34974c, fVar.f34973b, objNewInstance)) {
                        return null;
                    }
                    fileK.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileK.delete();
                }
            }
            a0();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f35698f, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) i.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public Typeface i(Context context, d2.i[] iVarArr, int i10) {
        Typeface typefaceCreateFromFile;
        String str;
        if (iVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(b4.p(iVarArr, i10).f15548a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } catch (ErrnoException unused) {
                        }
                        File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        if (file != null && file.canRead()) {
                            Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceCreateFromFile2;
                        }
                        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        try {
                            File fileK = d4.k(context);
                            if (fileK == null) {
                                typefaceCreateFromFile = null;
                            } else {
                                try {
                                    if (d4.b(fileK, fileInputStream)) {
                                        typefaceCreateFromFile = Typeface.createFromFile(fileK.getPath());
                                        fileK.delete();
                                    }
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th2) {
                                    fileK.delete();
                                    throw th2;
                                }
                                fileK.delete();
                                typefaceCreateFromFile = null;
                            }
                            fileInputStream.close();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceCreateFromFile;
                        } finally {
                        }
                    } finally {
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
