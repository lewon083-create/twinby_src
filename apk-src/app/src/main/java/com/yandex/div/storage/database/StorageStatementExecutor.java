package com.yandex.div.storage.database;

import android.database.SQLException;
import com.google.android.gms.internal.ads.om1;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.DivStorageErrorException;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import ij.e;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import org.jetbrains.annotations.NotNull;

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
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class StorageStatementExecutor {

    @NotNull
    private final Function0<DatabaseOpenHelper.Database> dbProvider;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivDataRepository.ActionOnError.values().length];
            try {
                iArr[DivDataRepository.ActionOnError.ABORT_TRANSACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivDataRepository.ActionOnError.SKIP_ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StorageStatementExecutor(@NotNull Function0<? extends DatabaseOpenHelper.Database> function0) {
        this.dbProvider = function0;
    }

    private static final void execute$executeCatchingSqlException(f0 f0Var, e0 e0Var, StorageStatement[] storageStatementArr, DivDataRepository.ActionOnError actionOnError, StorageStatementExecutor storageStatementExecutor, List<DivStorageErrorException> list, ClosableSqlCompiler closableSqlCompiler, StorageStatement storageStatement) {
        try {
            storageStatement.execute(closableSqlCompiler);
        } catch (SQLException e3) {
            execute$handleException(f0Var, e0Var, storageStatementArr, actionOnError, storageStatementExecutor, list, e3);
        } catch (IllegalStateException e7) {
            execute$handleException(f0Var, e0Var, storageStatementArr, actionOnError, storageStatementExecutor, list, e7);
        }
    }

    private static final void execute$handleException(f0 f0Var, e0 e0Var, StorageStatement[] storageStatementArr, DivDataRepository.ActionOnError actionOnError, StorageStatementExecutor storageStatementExecutor, List<DivStorageErrorException> list, Exception exc) {
        StringBuilder sb2 = new StringBuilder("Exception at statement '");
        sb2.append(f0Var.f27510b);
        sb2.append("' (");
        sb2.append(e0Var.f27508b);
        sb2.append(" out ");
        String strL = om1.l(sb2, storageStatementArr.length, ')');
        int i = WhenMappings.$EnumSwitchMapping$0[actionOnError.ordinal()];
        if (i == 1) {
            storageStatementExecutor.throwWithLogging(strL, exc);
            throw new e();
        }
        if (i != 2) {
            return;
        }
        list.add(new DivStorageErrorException(strL, exc, null, 4, null));
    }

    private final Void throwWithLogging(String str, Exception exc) {
        throw new SQLException(str, exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0087 A[PHI: r3 r6
      0x0087: PHI (r3v5 com.yandex.div.storage.database.DatabaseOpenHelper$Database) = 
      (r3v3 com.yandex.div.storage.database.DatabaseOpenHelper$Database)
      (r3v6 com.yandex.div.storage.database.DatabaseOpenHelper$Database)
     binds: [B:35:0x0085, B:44:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r6v7 com.yandex.div.storage.database.ClosableSqlCompiler) = (r6v5 com.yandex.div.storage.database.ClosableSqlCompiler), (r6v8 com.yandex.div.storage.database.ClosableSqlCompiler) binds: [B:35:0x0085, B:44:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.div.storage.database.ExecutionResult execute(@org.jetbrains.annotations.NotNull com.yandex.div.storage.DivDataRepository.ActionOnError r16, @org.jetbrains.annotations.NotNull com.yandex.div.storage.database.StorageStatement... r17) throws java.lang.Throwable {
        /*
            r15 = this;
            r2 = r17
            kotlin.jvm.internal.e0 r1 = new kotlin.jvm.internal.e0
            r1.<init>()
            r8 = 1
            r1.f27508b = r8
            kotlin.jvm.internal.f0 r0 = new kotlin.jvm.internal.f0
            r0.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r10 = "Error during statements execution."
            r3 = 0
            kotlin.jvm.functions.Function0<com.yandex.div.storage.database.DatabaseOpenHelper$Database> r4 = r15.dbProvider     // Catch: java.lang.Throwable -> L65 java.lang.IllegalStateException -> L68 android.database.SQLException -> L6c
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L65 java.lang.IllegalStateException -> L68 android.database.SQLException -> L6c
            r9 = r4
            com.yandex.div.storage.database.DatabaseOpenHelper$Database r9 = (com.yandex.div.storage.database.DatabaseOpenHelper.Database) r9     // Catch: java.lang.Throwable -> L65 java.lang.IllegalStateException -> L68 android.database.SQLException -> L6c
            com.yandex.div.storage.database.ClosableSqlCompiler r6 = new com.yandex.div.storage.database.ClosableSqlCompiler     // Catch: java.lang.Throwable -> L5a java.lang.IllegalStateException -> L5d android.database.SQLException -> L61
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L5a java.lang.IllegalStateException -> L5d android.database.SQLException -> L61
            r9.beginTransaction()     // Catch: java.lang.Throwable -> L41 java.lang.IllegalStateException -> L45 android.database.SQLException -> L49
            int r11 = r2.length     // Catch: java.lang.Throwable -> L41 java.lang.IllegalStateException -> L45 android.database.SQLException -> L49
            r3 = 0
            r12 = r3
        L2b:
            if (r12 >= r11) goto L4d
            r7 = r2[r12]     // Catch: java.lang.Throwable -> L41 java.lang.IllegalStateException -> L45 android.database.SQLException -> L49
            r0.f27510b = r7     // Catch: java.lang.Throwable -> L41 java.lang.IllegalStateException -> L45 android.database.SQLException -> L49
            r4 = r15
            r3 = r16
            execute$executeCatchingSqlException(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L41 java.lang.IllegalStateException -> L45 android.database.SQLException -> L49
            int r2 = r1.f27508b     // Catch: java.lang.Throwable -> L41 java.lang.IllegalStateException -> L45 android.database.SQLException -> L49
            int r2 = r2 + r8
            r1.f27508b = r2     // Catch: java.lang.Throwable -> L41 java.lang.IllegalStateException -> L45 android.database.SQLException -> L49
            int r12 = r12 + 1
            r2 = r17
            goto L2b
        L41:
            r0 = move-exception
        L42:
            r3 = r9
            goto Lab
        L45:
            r0 = move-exception
            r11 = r0
        L47:
            r3 = r9
            goto L70
        L49:
            r0 = move-exception
            r11 = r0
        L4b:
            r3 = r9
            goto L8d
        L4d:
            r9.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L41 java.lang.IllegalStateException -> L45 android.database.SQLException -> L49
            com.yandex.div.storage.util.SqlExtensionsKt.endTransactionSilently(r9)
            r6.close()
            com.yandex.div.storage.util.SqlExtensionsKt.closeSilently(r9)
            goto La5
        L5a:
            r0 = move-exception
            r6 = r3
            goto L42
        L5d:
            r0 = move-exception
            r11 = r0
            r6 = r3
            goto L47
        L61:
            r0 = move-exception
            r11 = r0
            r6 = r3
            goto L4b
        L65:
            r0 = move-exception
            r6 = r3
            goto Lab
        L68:
            r0 = move-exception
            r11 = r0
            r6 = r3
            goto L70
        L6c:
            r0 = move-exception
            r11 = r0
            r6 = r3
            goto L8d
        L70:
            com.yandex.div.storage.DivStorageErrorException r9 = new com.yandex.div.storage.DivStorageErrorException     // Catch: java.lang.Throwable -> L8b
            r13 = 4
            r14 = 0
            r12 = 0
            r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L8b
            r5.add(r9)     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L80
            com.yandex.div.storage.util.SqlExtensionsKt.endTransactionSilently(r3)
        L80:
            if (r6 == 0) goto L85
            r6.close()
        L85:
            if (r3 == 0) goto La5
        L87:
            com.yandex.div.storage.util.SqlExtensionsKt.closeSilently(r3)
            goto La5
        L8b:
            r0 = move-exception
            goto Lab
        L8d:
            com.yandex.div.storage.DivStorageErrorException r9 = new com.yandex.div.storage.DivStorageErrorException     // Catch: java.lang.Throwable -> L8b
            r13 = 4
            r14 = 0
            r12 = 0
            r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L8b
            r5.add(r9)     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L9d
            com.yandex.div.storage.util.SqlExtensionsKt.endTransactionSilently(r3)
        L9d:
            if (r6 == 0) goto La2
            r6.close()
        La2:
            if (r3 == 0) goto La5
            goto L87
        La5:
            com.yandex.div.storage.database.ExecutionResult r0 = new com.yandex.div.storage.database.ExecutionResult
            r0.<init>(r5)
            return r0
        Lab:
            if (r3 == 0) goto Lb0
            com.yandex.div.storage.util.SqlExtensionsKt.endTransactionSilently(r3)
        Lb0:
            if (r6 == 0) goto Lb5
            r6.close()
        Lb5:
            if (r3 == 0) goto Lba
            com.yandex.div.storage.util.SqlExtensionsKt.closeSilently(r3)
        Lba:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.storage.database.StorageStatementExecutor.execute(com.yandex.div.storage.DivDataRepository$ActionOnError, com.yandex.div.storage.database.StorageStatement[]):com.yandex.div.storage.database.ExecutionResult");
    }

    @NotNull
    public final ExecutionResult execute(@NotNull StorageStatement... storageStatementArr) {
        return execute(DivDataRepository.ActionOnError.ABORT_TRANSACTION, (StorageStatement[]) Arrays.copyOf(storageStatementArr, storageStatementArr.length));
    }
}
