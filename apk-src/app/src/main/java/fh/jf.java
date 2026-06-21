package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jf implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17489a;

    public jf(sy syVar) {
        this.f17489a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bf deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        sy syVar = this.f17489a;
        ij.p pVar = syVar.m9;
        ij.p pVar2 = syVar.z1;
        ij.p pVar3 = syVar.X2;
        TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
        Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_item_color", typeHelper, function1, mf.f17831a);
        TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_item_size", typeHelper2, function12, mf.f17843n, mf.f17832b);
        ij.p pVar4 = syVar.p6;
        Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", mf.f17839j, v0.f18733v);
        Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", mf.f17840k, v0.f18734w);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, typeHelper2, function12, mf.f17844o, mf.f17833c);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animation", mf.f17841l, be.A, mf.f17834d);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", syVar.f18533t1);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f22054g, syVar.F1);
        TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, function13, mf.f17845p);
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", syVar.O2);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", syVar.f18335a3);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", syVar.H3);
        ij.p pVar5 = syVar.T6;
        lo loVar = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", pVar5);
        if (loVar == null) {
            loVar = mf.f17835e;
        }
        lo loVar2 = loVar;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_item_color", typeHelper, function1, mf.f17836f);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "minimum_item_size", typeHelper2, function12, mf.f17846q, mf.f17837g);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, function13, mf.f17847r);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", syVar.f18443k1);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", syVar.O8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", kv.f17646g, mf.f17848s);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", syVar.U8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", syVar.f18341a9);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, mf.f17842m, kv.f17653o, mf.f17838h);
        yw ywVar = (yw) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", pVar);
        List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", pVar);
        lo loVar3 = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", pVar5);
        if (loVar3 == null) {
            loVar3 = mf.i;
        }
        return new bf(optionalExpression, optionalExpression2, optionalList, loVar2, ywVar, optionalList2, loVar3);
    }
}
