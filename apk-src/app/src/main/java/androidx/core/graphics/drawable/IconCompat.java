package androidx.core.graphics.drawable;

import a2.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import c2.f;
import g2.t0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1321k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f1324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f1325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f1328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1329h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1330j;

    public IconCompat() {
        this.f1322a = -1;
        this.f1324c = null;
        this.f1325d = null;
        this.f1326e = 0;
        this.f1327f = 0;
        this.f1328g = null;
        this.f1329h = f1321k;
        this.i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z5) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z5) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f1326e = i;
        iconCompat.f1323b = "";
        iconCompat.f1330j = "";
        return iconCompat;
    }

    public final int c() {
        int i = this.f1322a;
        if (i != -1) {
            if (i == 2) {
                return this.f1326e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        Object obj = this.f1323b;
        if (Build.VERSION.SDK_INT >= 28) {
            return f.f(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (NoSuchMethodException e7) {
            Log.e("IconCompat", "Unable to get icon resource", e7);
            return 0;
        } catch (InvocationTargetException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        }
    }

    public final int d() {
        int i = this.f1322a;
        if (i != -1) {
            return i;
        }
        Object obj = this.f1323b;
        if (Build.VERSION.SDK_INT >= 28) {
            return f.n(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e3) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e3);
            return -1;
        } catch (NoSuchMethodException e7) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e7);
            return -1;
        } catch (InvocationTargetException e10) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        }
    }

    public final Uri e() {
        int i = this.f1322a;
        if (i != -1) {
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.f1323b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        Object obj = this.f1323b;
        if (Build.VERSION.SDK_INT >= 28) {
            return f.o(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (NoSuchMethodException e7) {
            Log.e("IconCompat", "Unable to get icon uri", e7);
            return null;
        } catch (InvocationTargetException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        }
    }

    public final Icon f(Context context) {
        Icon iconCreateWithBitmap;
        int i = this.f1322a;
        String strG = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream = null;
        strG = null;
        strG = null;
        switch (i) {
            case -1:
                return (Icon) this.f1323b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f1323b);
                break;
            case 2:
                if (i == -1) {
                    Object obj = this.f1323b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        strG = f.g(obj);
                    } else {
                        try {
                            strG = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                        } catch (NoSuchMethodException e7) {
                            Log.e("IconCompat", "Unable to get icon package", e7);
                        } catch (InvocationTargetException e10) {
                            Log.e("IconCompat", "Unable to get icon package", e10);
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str = this.f1330j;
                    strG = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f1323b).split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0] : this.f1330j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strG, this.f1326e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f1323b, this.f1326e, this.f1327f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f1323b);
                break;
            case 5:
                iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(a((Bitmap) this.f1323b, false)) : a.a((Bitmap) this.f1323b);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = t0.b(e());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + e());
                    }
                    Uri uriE = e();
                    String scheme = uriE.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriE);
                        } catch (Exception e11) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriE, e11);
                        }
                        break;
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) this.f1323b));
                        } catch (FileNotFoundException e12) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriE, e12);
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + e());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                    } else {
                        iconCreateWithBitmap = a.a(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.f1328g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f1329h;
        if (mode != f1321k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f1322a == -1) {
            return String.valueOf(this.f1323b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f1322a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f1322a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1323b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f1323b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f1330j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1326e);
                if (this.f1327f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f1327f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f1323b);
                break;
        }
        if (this.f1328g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1328g);
        }
        if (this.f1329h != f1321k) {
            sb2.append(" mode=");
            sb2.append(this.f1329h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i) {
        this.f1324c = null;
        this.f1325d = null;
        this.f1326e = 0;
        this.f1327f = 0;
        this.f1328g = null;
        this.f1329h = f1321k;
        this.i = null;
        this.f1322a = i;
    }
}
