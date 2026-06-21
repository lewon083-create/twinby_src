package com.vk.sdk.api.utils.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class UtilsLinkChecked {

    @b("link")
    @Nullable
    private final String link;

    @b("status")
    @Nullable
    private final UtilsLinkCheckedStatus status;

    public UtilsLinkChecked() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UtilsLinkChecked copy$default(UtilsLinkChecked utilsLinkChecked, String str, UtilsLinkCheckedStatus utilsLinkCheckedStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = utilsLinkChecked.link;
        }
        if ((i & 2) != 0) {
            utilsLinkCheckedStatus = utilsLinkChecked.status;
        }
        return utilsLinkChecked.copy(str, utilsLinkCheckedStatus);
    }

    @Nullable
    public final String component1() {
        return this.link;
    }

    @Nullable
    public final UtilsLinkCheckedStatus component2() {
        return this.status;
    }

    @NotNull
    public final UtilsLinkChecked copy(@Nullable String str, @Nullable UtilsLinkCheckedStatus utilsLinkCheckedStatus) {
        return new UtilsLinkChecked(str, utilsLinkCheckedStatus);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsLinkChecked)) {
            return false;
        }
        UtilsLinkChecked utilsLinkChecked = (UtilsLinkChecked) obj;
        return Intrinsics.a(this.link, utilsLinkChecked.link) && this.status == utilsLinkChecked.status;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final UtilsLinkCheckedStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.link;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UtilsLinkCheckedStatus utilsLinkCheckedStatus = this.status;
        return iHashCode + (utilsLinkCheckedStatus != null ? utilsLinkCheckedStatus.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UtilsLinkChecked(link=" + this.link + ", status=" + this.status + ")";
    }

    public UtilsLinkChecked(@Nullable String str, @Nullable UtilsLinkCheckedStatus utilsLinkCheckedStatus) {
        this.link = str;
        this.status = utilsLinkCheckedStatus;
    }

    public /* synthetic */ UtilsLinkChecked(String str, UtilsLinkCheckedStatus utilsLinkCheckedStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : utilsLinkCheckedStatus);
    }
}
