utensils = {"fork", "spoon", "knife"}
dishes = {"chocolate", "strawberry", "vanilla"}
#faster than a list but index is not ordered
utensils.update(dishes)

for i in utensils:
    print(i + " ", end="")
print(utensils.difference(dishes))
print(utensils.intersection(dishes))
