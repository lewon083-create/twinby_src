package com.monetization.ads.core.identifiers.ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.Metadata;
import yads.ce;

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
public final class GmsServiceAdvertisingInfoReader implements ce, IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f15012a;

    public GmsServiceAdvertisingInfoReader(IBinder iBinder) {
        this.f15012a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f15012a;
    }

    @Override // yads.ce
    public Boolean readAdTrackingLimited() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            boolean z5 = true;
            parcelObtain.writeInt(1);
            this.f15012a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            if (parcelObtain2.readInt() == 0) {
                z5 = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z5);
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return boolValueOf;
        } catch (Throwable unused) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return null;
        }
    }

    @Override // yads.ce
    public String readAdvertisingId() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.f15012a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            String string = parcelObtain2.readString();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return string;
        } catch (Throwable unused) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return null;
        }
    }
}
