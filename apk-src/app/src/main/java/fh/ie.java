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
public final class ie implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17384a;

    public ie(sy syVar) {
        this.f17384a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final he deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        sy syVar = this.f17384a;
        ij.p pVar = syVar.m9;
        ij.p pVar2 = syVar.z1;
        ij.p pVar3 = syVar.X2;
        ij.p pVar4 = syVar.T6;
        ij.p pVar5 = syVar.f18443k1;
        if (((u6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", syVar.f18503q1)) == null) {
            Expression expression = le.f17691a;
        }
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", pVar5);
        TypeHelper typeHelper = le.f17698h;
        v0 v0Var = v0.f18733v;
        Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, v0Var);
        TypeHelper typeHelper2 = le.i;
        v0 v0Var2 = v0.f18734w;
        Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, v0Var2);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, le.f17702m, le.f17691a);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", syVar.f18533t1);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f22054g, syVar.F1);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, le.f17692b);
        TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "column_count", typeHelper3, function1, le.f17703n);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, function1, le.f17704o);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", le.f17699j, v0Var, le.f17693c);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", le.f17700k, v0Var2, le.f17694d);
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", syVar.O2);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", syVar.f18335a3);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", syVar.H3);
        lo loVar = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", pVar4);
        if (loVar == null) {
            loVar = le.f17695e;
        }
        lo loVar2 = loVar;
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", syVar.f18530s9);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", pVar5);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, function1, le.f17705p);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", syVar.O8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", kv.f17646g, le.f17706q);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", syVar.U8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", syVar.f18341a9);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, le.f17701l, kv.f17653o, le.f17696f);
        yw ywVar = (yw) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", pVar);
        List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", pVar);
        lo loVar3 = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", pVar4);
        if (loVar3 == null) {
            loVar3 = le.f17697g;
        }
        return new he(optionalExpression, optionalExpression2, optionalList, loVar2, ywVar, optionalList2, loVar3);
    }
}
