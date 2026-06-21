package com.appsflyer.internal;

import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.yandex.varioqub.config.model.ConfigValue;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFb1sSDK {
    private final AFh1mSDK AFAdRevenueData;
    private final byte[] getRevenue;

    public AFb1sSDK(AFh1mSDK aFh1mSDK, byte[] bArr) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        this.AFAdRevenueData = aFh1mSDK;
        this.getRevenue = bArr;
    }

    public final void afInfoLog() {
        try {
            Map map = AFa1hSDK.f2437d;
            Object declaredConstructor = map.get(-1994295490);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1hSDK.getRevenue((CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConfigValue.DOUBLE_DEFAULT_VALUE ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConfigValue.DOUBLE_DEFAULT_VALUE ? 0 : -1)) + 88, (char) (58271 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getDeclaredConstructor(null);
                map.put(-1994295490, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(null);
            Object[] objArr = {this.AFAdRevenueData, this.getRevenue};
            Object method = map.get(2113693083);
            if (method == null) {
                method = ((Class) AFa1hSDK.getRevenue(136 - AndroidCharacter.getMirror('0'), (char) (58271 - (ViewConfiguration.getPressedStateDuration() >> 16)), 37 - (KeyEvent.getMaxKeyCode() >> 16))).getMethod("getMonetizationNetwork", AFh1mSDK.class, byte[].class);
                map.put(2113693083, method);
            }
            ((Method) method).invoke(objNewInstance, objArr);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
