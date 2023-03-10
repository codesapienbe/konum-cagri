package org.codesapiens.data.entity;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.codesapiens.data.dto.MessageDto;
import org.codesapiens.data.dto.PersonDto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "messages")
public class MessageEntity extends AbstractEntity {

    @NotNull
    @ManyToOne(optional = false)
    private PersonEntity sender;

    @NotNull
    private String channel;
    @Lob
    private String text;

    private LocalDate date;

    private LocalTime time;

    public static MessageEntity fromDto(MessageDto dto) {
        final var entity = new MessageEntity();
        entity.setSender(PersonEntity.fromDto(dto.getSender()));
        entity.setChannel(dto.getChannel());
        entity.setText(dto.getText());
        entity.setDate(dto.getDate());
        entity.setTime(dto.getTime());
        return entity;
    }

    public MessageDto toDto() {
        final var dto = new MessageDto();
        dto.setSender(PersonDto.fromEntity(this.getSender()));
        dto.setChannel(this.getChannel());
        dto.setText(this.getText());
        dto.setDate(this.getDate());
        dto.setTime(this.getTime());
        return dto;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public MessageEntity() {
    }

    public MessageEntity(PersonEntity sender, String channel, String text) {
        this.sender = sender;
        this.channel = channel;
        this.text = text;
    }

    public PersonEntity getSender() {
        return sender;
    }

    public void setSender(PersonEntity sender) {
        this.sender = sender;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessageEntity)) return false;
        MessageEntity that = (MessageEntity) o;
        return Objects.equals(sender, that.sender) &&
                Objects.equals(channel, that.channel) &&
                Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, channel, text);
    }

    @Override
    public String toString() {
        return this.getText();
    }


}
