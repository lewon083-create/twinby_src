package com.vk.api.sdk.internal;

import a0.u;
import android.net.Uri;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public interface HttpMultipartEntry {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Text implements HttpMultipartEntry {
        private String textValue;

        public Text(String textValue) {
            Intrinsics.checkNotNullParameter(textValue, "textValue");
            this.textValue = textValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Text) {
                return Intrinsics.a(this.textValue, ((Text) obj).textValue);
            }
            return false;
        }

        public final String getTextValue() {
            return this.textValue;
        }

        public int hashCode() {
            return this.textValue.hashCode();
        }

        public final void setTextValue(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.textValue = str;
        }

        public String toString() {
            return u.o(new StringBuilder("Text{textValue='"), this.textValue, "'}");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class File implements HttpMultipartEntry {
        private String fileName;
        private Uri fileUri;

        public File(Uri fileUri) {
            Intrinsics.checkNotNullParameter(fileUri, "fileUri");
            this.fileUri = fileUri;
            this.fileName = fileUri.getLastPathSegment();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof File) {
                return Intrinsics.a(this.fileUri, ((File) obj).fileUri);
            }
            return false;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final Uri getFileUri() {
            return this.fileUri;
        }

        public int hashCode() {
            return this.fileUri.hashCode();
        }

        public final void setFileName(String str) {
            this.fileName = str;
        }

        public final void setFileUri(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "<set-?>");
            this.fileUri = uri;
        }

        public String toString() {
            return "File{fileUri='" + this.fileUri + "'}";
        }

        public File(Uri fileUri, String fileName) {
            Intrinsics.checkNotNullParameter(fileUri, "fileUri");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            this.fileUri = fileUri;
            this.fileName = fileName;
        }
    }
}
