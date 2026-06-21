package x1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.b4;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class i extends b4 {
    public static Font Z(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iC0 = c0(fontStyle, font.getStyle());
        for (int i10 = 1; i10 < fontFamily.getSize(); i10++) {
            Font font2 = fontFamily.getFont(i10);
            int iC02 = c0(fontStyle, font2.getStyle());
            if (iC02 < iC0) {
                font = font2;
                iC0 = iC02;
            }
        }
        return font;
    }

    public static int c0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily a0(d2.i[] iVarArr, ContentResolver contentResolver) {
        Font fontBuild;
        String str;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (d2.i iVar : iVarArr) {
            if (Objects.equals(iVar.f15548a.getScheme(), "systemfont")) {
                fontBuild = b0(iVar);
            } else {
                try {
                    Uri uri = iVar.f15548a;
                    str = iVar.f15552e;
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e3) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
                    fontBuild = null;
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    fontBuild = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(iVar.f15550c).setSlant(iVar.f15551d ? 1 : 0).setTtcIndex(iVar.f15549b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        fontBuild = ttcIndex.build();
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font b0(d2.i iVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final Typeface h(Context context, w1.e eVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (w1.f fVar : eVar.f34971a) {
                try {
                    Font fontBuild = new Font.Builder(resources, fVar.f34977f).setWeight(fVar.f34973b).setSlant(fVar.f34974c ? 1 : 0).setTtcIndex(fVar.f34976e).setFontVariationSettings(fVar.f34975d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(Z(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final Typeface i(Context context, d2.i[] iVarArr, int i) {
        try {
            FontFamily fontFamilyA0 = a0(iVarArr, context.getContentResolver());
            if (fontFamilyA0 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyA0).setStyle(Z(fontFamilyA0, i).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final Typeface j(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyA0 = a0((d2.i[]) list.get(0), contentResolver);
            if (fontFamilyA0 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyA0);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily fontFamilyA02 = a0((d2.i[]) list.get(i10), contentResolver);
                if (fontFamilyA02 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyA02);
                }
            }
            return customFallbackBuilder.setStyle(Z(fontFamilyA0, i).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final Typeface k(Context context, Resources resources, int i, String str, int i10) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }
}
